CREATE SEQUENCE fruta_seq; 
CREATE TABLE frutas(
	nome VARCHAR(20) NOT NULL UNIQUE,
	valor_unitario FLOAT NOT NULL,
	quantidade INT NOT NULL,
	tempo VARCHAR(10) NOT NULL,
	codigo CHAR(8) NOT NULL DEFAULT to_char(nextval('fruta_seq'), 'A0000000FM') UNIQUE,
	
	PRIMARY KEY(codigo, nome)
);
ALTER SEQUENCE fruta_seq OWNED BY frutas.codigo; 


CREATE SEQUENCE compras_seq; 
CREATE TABLE compras(
	nomeFruta VARCHAR(20) NOT NULL UNIQUE,
	quantidade int NOT NULL,
	valor_unitario FLOAT NOT NULL,
	codigoFruta char(8) NOT NULL UNIQUE,
	
	PRIMARY KEY(nomeFruta),
	FOREIGN KEY(nomeFruta) REFERENCES frutas(nome)
);
ALTER SEQUENCE compras_seq OWNED BY compras.nomeFruta; 


INSERT INTO frutas (nome, valor_unitario, quantidade, tempo)
VALUES
('banana', 0.55, 240, '09/00/00'),
('pera', 0.75, 200, '12/00/00'),
('maca', 1.25, 370, '10/00/00'),
('tangerina', 0.70, 220, '15/00/00'),
('goiaba', 1.50, 490, '08/00/00'),
('melao', 4.65, 150, '19/00/00');

