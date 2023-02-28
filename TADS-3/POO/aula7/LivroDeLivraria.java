public class LivroDeLivraria{
	public static void main(String[] args) {
		Livro livro = new Livro();

		livro.nome = "livro1";
		livro.autor = "autor1";
		livro.editora = "editora1";
		livro.preco = 24.99;

		System.out.println(livro.nome);
		System.out.println(livro.autor);
		System.out.println(livro.editora);
		System.out.println(livro.preco);
	}
}