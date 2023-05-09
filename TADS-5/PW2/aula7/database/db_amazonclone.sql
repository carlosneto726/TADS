CREATE TABLE produtos(
	id int NOT NULL AUTO_INCREMENT,
	descricao varchar(255),
	preco float,
	qtd int,
	status char,
	url varchar(255),

	PRIMARY KEY(id)
);

CREATE TABLE usuarios(
	id int NOT NULL AUTO_INCREMENT,
	nome varchar(255),
	senha varchar(255),

	PRIMARY KEY (id)
);

CREATE TABLE vendas(
	id int NOT NULL AUTO_INCREMENT,
	id_usuario int NOT NULL,
	descricao varchar(255),
	data date,
	status char,

	PRIMARY KEY	(id),
	FOREIGN KEY(id_usuario) REFERENCES usuarios(id)
);


CREATE TABLE item_venda(
	id int NOT NULL AUTO_INCREMENT,
	id_venda int NOT NULL,
	id_produto int NOT NULL,
	qtd int NOT NULL,

	PRIMARY KEY (id),
	FOREIGN KEY (id_venda) REFERENCES vendas(id),
	FOREIGN KEY (id_produto) REFERENCES produtos(id)
);

