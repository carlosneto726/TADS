SET search_path TO aula_triggers

CREATE TABLE EX2_CLIENTE(
 codcliente int,
 nome varchar(60),
 datanascimento date,
 cpf varchar(11),
 CONSTRAINT pk2_EX2_cliente PRIMARY KEY (codcliente)
);

CREATE TABLE EX2_PEDIDO(
 codpedido int,
 codcliente int,
 datapedido date,
 nf varchar(12),
 valortotal decimal(10,2),
 CONSTRAINT pk2_EX2_pedido PRIMARY KEY (codpedido),
 CONSTRAINT pk2_EX2_pedido_cliente FOREIGN KEY (codcliente) REFERENCES EX2_CLIENTE(codcliente)
);

CREATE TABLE EX2_PRODUTO(
 codproduto int,
 descricao varchar(100),
 quantidade int,
 CONSTRAINT pk2_EX2_produto PRIMARY KEY (codproduto)
);

CREATE TABLE EX2_ITEMPEDIDO(
 codpedido int,
 numeroitem int,
 valorunitario decimal(10,2),
 quantidade int,
 codproduto int,
 CONSTRAINT pk2_itempedido PRIMARY KEY (codpedido, numeroitem),
 CONSTRAINT fk2_codpedido FOREIGN KEY (codpedido) REFERENCES EX2_PEDIDO (codpedido),
 CONSTRAINT fk2_itempedido_produto FOREIGN KEY (codproduto) REFERENCES EX2_PRODUTO
(codproduto)
);

CREATE TABLE EX2_LOG(
 codlog int,
 data date,
 descricao varchar(255),
 CONSTRAINT pk2_ex2_log PRIMARY KEY (codlog)
);
CREATE TABLE EX2_REQUISICAO_COMPRA(
 codrequisicaocompra int,
 codproduto int,
 data date,
 quantidade int,
 CONSTRAINT pk2_ex2_reqcompra PRIMARY KEY (codrequisicaocompra),
 CONSTRAINT fk2_ex2_reqcompra_produto FOREIGN KEY (codproduto) REFERENCES
EX2_PRODUTO(codproduto)
);

INSERT INTO EX2_CLIENTE VALUES (1, 'Sylvio Barbon', TO_DATE('05/12/1984', 'DD/MM/YYYY'),
'12315541212');
INSERT INTO EX2_CLIENTE VALUES (2, 'Antonio Carlos da Silva', TO_DATE('01/11/1970', 'DD/MM/YYYY'),
'12313345512');
INSERT INTO EX2_CLIENTE VALUES (3, 'Thiago Ribeiro', TO_DATE('15/11/1964', 'DD/MM/YYYY'),
'12315544411');
INSERT INTO EX2_CLIENTE VALUES (4, 'Carlos Eduardo', TO_DATE('25/10/1924', 'DD/MM/YYYY'),
'42515541212');
INSERT INTO EX2_CLIENTE VALUES (5, 'Maria Cristina Goes', TO_DATE('03/11/1981', 'DD/MM/YYYY'),
'67715541212');
INSERT INTO EX2_CLIENTE VALUES (6, 'Ruan Manoel Fanjo', TO_DATE('06/12/1983', 'DD/MM/YYYY'),
'32415541212');
INSERT INTO EX2_CLIENTE VALUES (7, 'Patrícia Marques', TO_DATE('01/02/1944', 'DD/MM/YYYY'),
'77715541212');

INSERT INTO EX2_PRODUTO VALUES (1, 'Mouse', 10);
INSERT INTO EX2_PRODUTO VALUES (2, 'Teclado', 10);
INSERT INTO EX2_PRODUTO VALUES (3, 'Monitor LCD', 10);
INSERT INTO EX2_PRODUTO VALUES (4, 'Caixas Acústicas', 10);
INSERT INTO EX2_PRODUTO VALUES (5, 'Scanner de Mesa', 10);

INSERT INTO EX2_PEDIDO VALUES (1, 1, TO_DATE('01/04/2012', 'DD/MM/YYYY'), '00001', 400.00);
INSERT INTO EX2_ITEMPEDIDO VALUES (1, 1, 10.90, 1, 1);
INSERT INTO EX2_ITEMPEDIDO VALUES (1, 2, 389.10, 1, 3);
INSERT INTO EX2_PEDIDO VALUES (2, 2, TO_DATE('01/04/2012', 'DD/MM/YYYY'), '00002', 10.90);
INSERT INTO EX2_ITEMPEDIDO VALUES (2, 1, 10.90, 1, 1);
INSERT INTO EX2_PEDIDO VALUES (3, 2, TO_DATE('01/04/2012', 'DD/MM/YYYY'), '00003', 21.80);
INSERT INTO EX2_ITEMPEDIDO VALUES (3, 1, 10.90, 1, 1);
INSERT INTO EX2_PEDIDO VALUES (4, 3, TO_DATE('01/05/2012', 'DD/MM/YYYY'), '00004', 169.10);
INSERT INTO EX2_ITEMPEDIDO VALUES (4, 1, 10.90, 1, 1);
INSERT INTO EX2_ITEMPEDIDO VALUES (4, 2, 15.90, 2, 2);
INSERT INTO EX2_ITEMPEDIDO VALUES (4, 3, 25.50, 1, 4);
INSERT INTO EX2_ITEMPEDIDO VALUES (4, 4, 100.90, 1, 5);
INSERT INTO EX2_PEDIDO VALUES (5, 4, TO_DATE('01/05/2012', 'DD/MM/YYYY'), '00005', 100.90);
INSERT INTO EX2_ITEMPEDIDO VALUES (5, 1, 100.90, 1, 5);
INSERT INTO EX2_PEDIDO VALUES (6, 6, TO_DATE('02/05/2012', 'DD/MM/YYYY'), '00006', 51.35);
INSERT INTO EX2_ITEMPEDIDO VALUES (6, 1, 25.50, 2, 4);

CREATE SEQUENCE EX2_LOG_SEQ
 START WITH 1
 INCREMENT BY 1
 MAXVALUE 99999
 MINVALUE 1
 CACHE 20
 ;
 
 
 
-- Ex1
create or replace function vendeu()
returns trigger as
$$
	begin 
		update EX2_produto
		set quantidade = quantidade - new.quantidade
		where codproduto = new.codproduto;
		return new;
	end;
$$
language 'plpgsql';

create trigger "vendeuProduto"
after insert on EX2_ITEMPEDIDO
for each row
execute procedure vendeu()

select * from EX2_PRODUTO; -- antes de retirar um produto

INSERT INTO EX2_ITEMPEDIDO VALUES (4, 8, 100.90, 1, 5); -- retirando um produto

select * from EX2_PRODUTO; -- depois de retirar um produtp






--Ex2
 
create or replace function clienteModificado()
returns trigger as
$$
	begin 
		insert into EX2_LOG 
		values (old.codlog, CURRENT_DATA, 'UPDATE' || new.cpf)
		return new;
	end;
$$
language 'plpgsql';

create trigger "cliente_modificado"
after insert on EX2_CLIENTE
for each row
execute procedure clienteModificado()





--Ex3

create or replace function produto_atualizado()
returns trigger as
$$
	begin 
		insert into EX2_LOG 
		values (old.codproduto, 'UPDATE' || new.descricao)
		return new;

	end;
$$
language 'plpgsql';

create trigger "produto_atualizado"
after insert on EX2_PRODUTO
for each row
execute procedure produtoModificado()
 
 
--Ex4

create or replace function Valor_pedido()
returns trigger as
$$
	begin 
		if(valortotal > 1000)
		then
			insert into EX2_LOG 
			values (old.codpedido, codcliente, datapedido, nf, valortotal, 'UPDATE')
			return new;
	end;
$$
language 'plpgsql';

create trigger "tg_Valor_pedido"
after insert on EX2_PEDIDO
for each row
execute procedure Valor_pedido()

