package com.mycompany.crud;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class LeitorArquivo extends JFrame implements ActionListener {

	// variável final apenas para guardar quebra de linha das mensagens
	private final String newline = "\n";
	
	// componentes da tela. Painel, Botões, textarea e JFileChooser
	private JPanel painel;
	private JButton botaoAbrir;
	private JButton botaoBaixar;
	private JTextArea log;
	private JFileChooser fc;
	private JLabel lbImagem;
	
	private Conexao con;
	
	// objeto onde ficará guardado o arquivo selecionado
	private File arquivo;

	// método construtor
	public LeitorArquivo() {
		super("LeitorPdf");
		
		con = new Conexao();
		
		painel = new JPanel(new BorderLayout());

		// cria o FileChooser para escolher o arquivo
		fc = new JFileChooser();

		// cria o botão para escolher o arquivo
		botaoAbrir = new JButton("Escolher um arquivo...");
		botaoAbrir.addActionListener(this);
		
		// cria o botão para baixar o arquivo
		botaoBaixar = new JButton("Baixar o arquivo");
		botaoBaixar.addActionListener(this);

		// cria um painel para colocar o botão
		JPanel botoes = new JPanel();
		botoes.setLayout(new FlowLayout());
		botoes.add(botaoAbrir);
		botoes.add(botaoBaixar);
		
		lbImagem = new JLabel();
		lbImagem.setHorizontalAlignment(JLabel.CENTER);
		
		// exibe a imagem na tela
		exibirImagem();
		
		// cria o textArea para guardar as mensagens de log
		log = new JTextArea(5, 20);
		log.setMargin(new Insets(5, 5, 5, 5));
		log.setEditable(false);
		JScrollPane logPainel = new JScrollPane(log);
		
		painel.add(botoes, BorderLayout.PAGE_START);
		painel.add(lbImagem, BorderLayout.CENTER);
		painel.add(logPainel, BorderLayout.PAGE_END);
		
		add(painel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * ActionPerformed executado ao clicar em algum botão
	 */
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == botaoAbrir) {
			int retorno = fc.showOpenDialog(this);
			
			if (retorno == JFileChooser.APPROVE_OPTION) {
				arquivo = fc.getSelectedFile();
				salvarArquivoNoBd();
			} else {
				log.append("Cancelado pelo usuário." + newline);
			}
			
			log.setCaretPosition(log.getDocument().getLength());
		} else if (e.getSource() == botaoBaixar) {
			baixarArquivoDoBd();
		}
	}

	/**
	 * Método que guarda o arquivo selecionado no banco de dados.
	 */
        
        private int id;
        
        public int getId(){
            return id;
            
        }
        
        public void setId(int id){
            this.id = id;
            
        }
        
	public void salvarArquivoNoBd() {
		Conexao conexao = new Conexao();

		try {
			// inputStream com o arquivo selecionado
			FileInputStream fis = new FileInputStream(this.arquivo);
                        
                        PreparedStatement ps = conexao.getConnection().prepareStatement("UPDATE pessoa set nome_arquivo = ?, arquivo = ? WHERE id = ?;");
                        
                        ps.setInt(3, getId());
                        
                        ps.setString(1, this.arquivo.getName());
			ps.setBinaryStream(2, fis, (int) this.arquivo.length());
			
			// salva no banco de dados
			ps.executeUpdate();

			// fecha a consulta e o inputStream para agilizar a liberação de recursos do computador
			ps.close();
			fis.close();
			
			log.append("Salvando o arquivo: " + arquivo.getName() + newline);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Método que lê um arquivo do BD e salva no computador.
	 * 
	 * Necessário alterar o caminho para o que funcionar na sua aplicação.
	 * Observe que ele sempre lê apenas UM arquivo. E se quiser transformar numa lista?
	 */
	public void baixarArquivoDoBd() {
		// variável que vai ficar o conteúdo do arquivo
		byte[] fileBytes;
		try {
			PreparedStatement st = con.getConnection().prepareStatement("SELECT nome_arquivo, arquivo FROM pessoa");
			ResultSet rs = st.executeQuery();
			if (rs.next()) {
				fileBytes = rs.getBytes(2);
				OutputStream targetFile = new FileOutputStream("D:\\Users\\Imagens\\Saved Pictures\\"+rs.getString(1));
				targetFile.write(fileBytes);
				targetFile.close();
			}
			
			log.append("Baixando o arquivo..." + newline);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Método que retorna o binário de uma imagem do BD para exibí-lo na tela
	 * 
	 * Observe que sempre retorna o binário do arquivo de ID = 1!
	 */
	private void exibirImagem() {
		PreparedStatement st;
		try {
			st = con.getConnection().prepareStatement("SELECT arquivo FROM pessoa WHERE id = ?");
                        st.setInt(1, getId());
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				byte[] binario = rs.getBytes(1);
				InputStream is = new ByteArrayInputStream(binario);
				BufferedImage imag = ImageIO.read(is);
				ImageIcon icon = new ImageIcon(imag);
				lbImagem.setIcon(icon);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



