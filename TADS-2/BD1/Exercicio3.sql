create table cliente(
	cpf varchar(30),
	nome varchar(30),
	idade int,
	sexo varchar(30),
	
	primary key (cpf)
);


create table vendedor(
	cod int,
	porcentagem int,
	sexo varchar(30),
	nome varchar(30),
	salario int,
	
	primary key (cod)
);


create table doce(
	nome varchar(30),
	validade varchar(30),
	preco int,
	qtd int,
	
	
	primary key (nome)
);


create table venda(
	cod int,
	cod_vendedor int,
	dataVenda varchar(30),
	
	primary key (cod),
	foreign key (cod_vendedor) references vendedor(cod)
);


create table nota_fiscal(
	cod_venda int,
	cpf_cliente varchar(30),
	cod_vendedor int,
	doce_nome varchar(30),

	primary key (cod_venda),
	foreign key (cpf_cliente) references cliente(cpf),
	foreign key (cod_vendedor) references vendedor(cod),
	foreign key (doce_nome) references doce(nome)
);


insert into cliente (cpf, nome, idade, sexo)
values
('123.456.789-10', 'Jubileu20', 20, 'Masculino'),
('123.456.789-09', 'Jubileia32', 32, 'Feminino'),
('123.456.789-08', 'Jubileu10', 10, 'Masculino'),
('123.456.789-07', 'Jubileu15', 15, 'Masculino'),
('123.456.789-06', 'Jubileu16', 16, 'Masculino'),
('123.456.789-05', 'Jubileia09', 09, 'Feminino'),
('123.456.789-04', 'Jubileu21', 21, 'Masculino'),
('123.456.789-03', 'Jubileu04', 14, 'Masculino'),
('123.456.789-02', 'Jubileia12', 12, 'Feminino'),
('123.456.789-01', 'Jubileu19', 19, 'Masculino');


insert into vendedor (cod, porcentagem, sexo, nome, salario)
values
(123, 12, 'Masculino', 'Jubileio_v', 1.260),
(234, 10, 'Feminino', 'Jubileia_v', 1.500),
(345, 15, 'Masculino', 'Jubileio_V', 1.000),
(456, 14, 'Feminino', 'Jubileia_v', 1.050),
(567, 6, 'Feminino', 'Jubileia_v', 1.700);



insert into doce (nome, validade, preco, qtd)
values
('Doce_Banana', '15-02-2022', 3, 480),
('Doce_Pera', '01-05-2022', 4, 280),
('Doce_Maca', '26-07-2022', 2, 250),
('Doce_Mamao', '30-06-2022', 5, 140),
('Doce_Abacaxi', '06-07-2022', 3, 50),
('Doce_Kiwi', '07-07-2022', 4, 220),
('Doce_Cereja', '15-06-2022', 1, 450),
('Doce_Uva', '07-09-2022', 3, 310),
('Doce_Melancia', '14-02-2022', 4, 450),
('Doce_Coco', '15-02-2022', 2, 100),
('Doce_Goiaba', '20-12-2022', 2, 210),
('Doce_TutiFruti', '01-08-2022', 5, 500);


insert into venda (cod, cod_vendedor, dataVenda)
values
(1, 123, '28-10-2021'),
(2, 234, '28-10-2021'),
(3, 345, '28-10-2021'),
(4, 456, '28-10-2021'),
(5, 567, '28-10-2021'),
(6, 123, '28-10-2021'),
(7, 234, '28-10-2021'),
(8, 345, '28-10-2021'),
(9, 456, '28-10-2021'),
(10, 123, '02-11-2021'),
(12, 234, '02-11-2021'),
(13, 345, '02-11-2021'),
(14, 456, '02-11-2021'),
(15, 567, '02-11-2021'),
(16, 123, '02-11-2021'),
(17, 234, '02-11-2021'),
(18, 345, '02-11-2021'),
(19, 456, '02-11-2021'),
(20, 456, '21-12-2021'),
(21, 123, '21-12-2021'),
(22, 234, '21-12-2021'),
(23, 345, '21-12-2021'),
(24, 456, '21-12-2021'),
(25, 567, '21-12-2021'),
(26, 123, '21-12-2021'),
(27, 234, '21-12-2021'),
(28, 345, '21-12-2021'),
(29, 456, '21-12-2021'),
(30, 456, '05-01-2022'),
(31, 123, '05-01-2022'),
(32, 234, '05-01-2022'),
(33, 345, '05-01-2022'),
(34, 456, '05-01-2022'),
(35, 567, '05-01-2022'),
(36, 123, '05-01-2022'),
(37, 234, '05-01-2022'),
(38, 345, '05-01-2022'),
(39, 456, '05-01-2022'),
(40, 456, '14-01-2022'),
(41, 123, '14-01-2022'),
(42, 234, '14-01-2022'),
(43, 345, '14-01-2022'),
(44, 456, '14-01-2022'),
(45, 567, '14-01-2022'),
(46, 123, '14-01-2022'),
(47, 234, '14-01-2022'),
(48, 345, '14-01-2022'),
(49, 456, '26-01-2022'),
(50, 123, '26-01-2022'),
(51, 234, '26-01-2022'),
(52, 345, '26-01-2022'),
(53, 456, '26-01-2022'),
(54, 567, '26-01-2022'),
(55, 123, '26-01-2022'),
(56, 234, '26-01-2022'),
(57, 345, '26-01-2022'),
(58, 456, '26-01-2022');




insert into nota_fiscal (cod_venda, cpf_cliente, cod_vendedor, doce_nome)
values
(1000, '123.456.789-05', 234, 'Doce_Banana'),
(1001, '123.456.789-10', 567, 'Doce_Goiaba'),
(1002, '123.456.789-02', 567, 'Doce_Mamao'),
(1003, '123.456.789-01', 345, 'Doce_Uva'),
(1004, '123.456.789-09', 345, 'Doce_Uva'),
(1005, '123.456.789-05', 456, 'Doce_Coco'),
(1006, '123.456.789-01', 123, 'Doce_Banana'),
(1007, '123.456.789-05', 456, 'Doce_Mamao'),
(1008, '123.456.789-03', 123, 'Doce_Cereja'),
(1009, '123.456.789-05', 234, 'Doce_Coco'),
(1010, '123.456.789-04', 123, 'Doce_Pera'),
(1011, '123.456.789-01', 456, 'Doce_Maca'),
(1012, '123.456.789-06', 456, 'Doce_Coco'),
(1013, '123.456.789-10', 567, 'Doce_Cereja'),
(1014, '123.456.789-09', 567, 'Doce_Maca'),
(1015, '123.456.789-09', 345, 'Doce_Maca'),
(1016, '123.456.789-03', 234, 'Doce_Uva'),
(1017, '123.456.789-08', 567, 'Doce_Maca'),
(1018, '123.456.789-01', 234, 'Doce_Cereja'),
(1019, '123.456.789-04', 456, 'Doce_Pera'),
(1020, '123.456.789-09', 456, 'Doce_Abacaxi'),
(1021, '123.456.789-05', 123, 'Doce_TutiFruti'),
(1022, '123.456.789-06', 456, 'Doce_Abacaxi'),
(1023, '123.456.789-05', 567, 'Doce_Maca'),
(1024, '123.456.789-05', 123, 'Doce_Pera'),
(1025, '123.456.789-04', 234, 'Doce_Cereja'),
(1026, '123.456.789-08', 234, 'Doce_Kiwi'),
(1027, '123.456.789-06', 123, 'Doce_Mamao'),
(1028, '123.456.789-01', 567, 'Doce_Mamao'),
(1029, '123.456.789-01', 123, 'Doce_Coco'),
(1030, '123.456.789-06', 234, 'Doce_Pera'),
(1031, '123.456.789-02', 234, 'Doce_Melancia'),
(1032, '123.456.789-02', 234, 'Doce_Cereja'),
(1033, '123.456.789-01', 123, 'Doce_Coco'),
(1034, '123.456.789-10', 234, 'Doce_TutiFruti'),
(1035, '123.456.789-09', 123, 'Doce_TutiFruti'),
(1036, '123.456.789-06', 345, 'Doce_TutiFruti'),
(1037, '123.456.789-06', 234, 'Doce_Abacaxi'),
(1038, '123.456.789-01', 234, 'Doce_Cereja'),
(1039, '123.456.789-04', 567, 'Doce_Maca'),
(1040, '123.456.789-09', 234, 'Doce_Pera'),
(1041, '123.456.789-08', 123, 'Doce_Cereja'),
(1042, '123.456.789-01', 456, 'Doce_Uva'),
(1043, '123.456.789-05', 234, 'Doce_Goiaba'),
(1044, '123.456.789-10', 123, 'Doce_Uva'),
(1045, '123.456.789-03', 456, 'Doce_Kiwi'),
(1046, '123.456.789-03', 456, 'Doce_Mamao'),
(1047, '123.456.789-04', 234, 'Doce_Banana'),
(1048, '123.456.789-05', 123, 'Doce_Melancia'),
(1049, '123.456.789-09', 567, 'Doce_TutiFruti'),
(1050, '123.456.789-10', 123, 'Doce_Coco'),
(1051, '123.456.789-06', 345, 'Doce_Maca'),
(1052, '123.456.789-02', 567, 'Doce_TutiFruti'),
(1053, '123.456.789-09', 567, 'Doce_Uva'),
(1054, '123.456.789-05', 123, 'Doce_Maca'),
(1055, '123.456.789-10', 567, 'Doce_Coco'),
(1056, '123.456.789-08', 345, 'Doce_Uva'),
(1057, '123.456.789-09', 345, 'Doce_Melancia'),
(1058, '123.456.789-08', 567, 'Doce_TutiFruti');


--a 1º.Consulta que aborde o conceito de INNER JOIN;
select idade from cliente
inner join doce
on doce.nome = 'Doce_Banana';

--b 2º.Cconsulta que aborde o conceito de FUNÇÕES AGREDADAS;
select venda.cod from venda, vendedor
where cod_vendedor = venda.cod
group by venda.cod
having count(venda) > 3;

--c 3º.Consulta que aborde o conceito de ORDER BY;
select nome, qtd from doce
where preco > 4
order by qtd;

--d 4º.Consulta que aborde o conceito de CONSULTAS ANINHADAS;
select idade, cod_venda from cliente, nota_fiscal
where idade > 18 and cpf = cpf_cliente;

--e 5º.Cosulta
select nome, validade, preco,  dataVenda,
count(dataVenda) as quantidades_vendidas
from doce
inner join venda
on datavenda = '26-01-2022'
group by nome, validade, preco, dataVenda;
