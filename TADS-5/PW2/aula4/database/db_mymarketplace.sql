CREATE TABLE tb_users(
    id int NOT null AUTO_INCREMENT,
    email varchar(255) NOT null,
    passw varchar(255),
    
    PRIMARY KEY (id)
);

CREATE TABLE tb_lojas(
    id int NOT null AUTO_INCREMENT,
    nome varchar(255) NOT null,
    descricao varchar(255),
    id_user int,
    
    PRIMARY KEY (id),
    FOREIGN KEY (id_user) REFERENCES tb_users(id)
);

CREATE TABLE tb_produtos(
    id int NOT null AUTO_INCREMENT,
    nome varchar(255) NOT null,
    descricao varchar(255),
    preco float NOT null,
    id_loja int NOT null,
    
    PRIMARY KEY (id),
    FOREIGN KEY (id_loja) REFERENCES tb_lojas(id)
);