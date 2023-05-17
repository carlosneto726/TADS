CREATE TABLE tb_lojas(
	id int NOT NULL AUTO_INCREMENT,
	nome varchar(255),

	PRIMARY KEY(id)
);


CREATE TABLE tb_usuarios(
	id int NOT NULL AUTO_INCREMENT,
	nome varchar(255),
	email varchar(255),
	senha varchar(255),

	PRIMARY KEY (id)
);

CREATE TABLE tb_categorias(
	nome varchar(255) NOT NULL,
	PRIMARY KEY (nome)
);


CREATE TABLE tb_produtos(
	id int NOT NULL AUTO_INCREMENT,
	id_loja int NOT NULL,
	titulo varchar(255),
	descricao text,
	estrelas float,
	marca varchar(255),
	preco float,
	categoria varchar(255),
	qtd int,
	status char,
	img_url varchar(255),

	PRIMARY KEY(id),
	FOREIGN KEY(id_loja) REFERENCES tb_lojas(id),
	FOREIGN KEY(categoria) REFERENCES tb_categorias(nome)

);


CREATE TABLE tb_carrinho(
	id int NOT NULL AUTO_INCREMENT,
	id_produto int NOT NULL,
	id_usuario int NOT NULL,
	qtd int NOT NULL,

	PRIMARY KEY (id),
	FOREIGN KEY (id_produto) REFERENCES tb_produtos(id),
	FOREIGN KEY(id_usuario) REFERENCES tb_usuarios(id)
);


CREATE TABLE tb_vendas(
	id int NOT NULL AUTO_INCREMENT,
	id_usuario int NOT NULL,
	id_carrinho int NOT NULL,
	id_loja int NOT NULL,
	preco_total float,

	data date,
	status char,

	PRIMARY KEY	(id),
	FOREIGN KEY(id_usuario) REFERENCES tb_usuarios(id),
	FOREIGN KEY(id_carrinho) REFERENCES tb_carrinho(id),
	FOREIGN KEY(id_loja) REFERENCES tb_lojas(id)

);



INSERT INTO tb_lojas(nome) VALUES
('Amazon'), 	
('Riachuelo'), 	
('Google'), 	
('Sansung'), 	
('PLaystation'),
('Philco'), 	
('Barilla'), 	
('Eletrolux'), 	
('LG'), 		
('HP'); 			

INSERT INTO tb_usuarios(nome, email, senha) VALUES
('Administrador', 'adm@adm', 'adm'),
('Carlos', 'carlos@123', '123'),
('Pedro', 'pedro@123', '123');

INSERT INTO tb_categorias (nome) VALUES
('Cozinha'),
('Tecnoligia'),
('Games'),
('Roupas'),
('Celulares'),
('Acessorios');

INSERT INTO tb_produtos(id_loja, titulo,descricao,estrelas,marca,preco,categoria,qtd,status,img_url) VALUES
(5, 'Controle de PS4 Dualshok 4','Contole Dualshok 4 para Playstation 4 e PC',4.5,'PlayStation', 249.99,'Games',2049,'0','img/produtos/controller_ps4.jpg'),
(5, 'Controle de PS5 Dualshok 5','Contole Dualshok 5 para Playstation 5 PLaystation 4 e PC',4.0,'PlayStation', 549.99,'Games',876,'0','img/produtos/controller_ps5.jpg'),
(6, 'Cafeteira Philco','Cafeteira Philco que faz café em 2 minutos com capacidade de 2L e quente e frio',5.0,'Philco', 689.99,'Cozinha',600,'0','img/produtos/cozinha_cafeteiraphilco.jpg'),
(7, 'Macarrão Spaghetti Barilla','Spaguetti 500g Barilla serve 5 pessoas',4.0,'Barilla', 9.59,'Cozinha', 20000,'0','img/produtos/cozinha_macarrao.jpg'),
(3, 'Google Chromecast 3','Transmita seu conteúdo de onde e quando quiser | Streaming em Full HD', 5.0,'Google', 219,'Tecnoligia',15000,'0','img/produtos/tech_chromecast.jpg'),
(1, 'Echo Dot (4ª Geração)','Smart Speaker com Alexa | Música, informação e Casa Inteligente - Cor Preta',5.0,'Amazon', 269, 'Tecnoligia', 4562,'0','img/produtos/tech_echodot.jpg'),
(1, 'Suporte de Notebook','Suporte Uptable OCTOO, Preto', 5.0,'Amazon', 39.99,'Acessorios',15000,'0','img/produtos/tech_suportenotebook.jpg'),
(1, 'Capa Gel Banco', 'Capa Gel Banco Selim Almofada Para Bicicleta Bike Preto', 5.0,'Amazon', 42.93,'Acessorios',15000,'0','img/produtos/acessorios_capa_bike.jpg'),
(1, 'Apoio De Leitura Livro E Tablet - Oliver','Apoio De Leitura Livro E Tablet - Oliver', 5.0,'Amazon', 79.90,'Acessorios',15000,'0','img/produtos/acessorios_suporte_livro.jpg'),
(1, 'Carregador Universal Ultra Rápido','Geonav Carregador Universal Ultra Rápido, Power Delivery 25W, 1 Porta USB-C, CH25PDWT, Branco', 5.0,'Amazon', 122.32,'Acessorios',15000,'0','img/produtos/acessoriso_carregador_universal.jpg'),
(1, 'Película Para iPad', 'Melhor Película Para iPad 10ª Geração 10.9pol Novo Ano 2022 - Alamo', 5.0,'Amazon', 50.00,'Acessorios',15000,'0','img/produtos/acessorios_pelicula_ipad.jpg');
