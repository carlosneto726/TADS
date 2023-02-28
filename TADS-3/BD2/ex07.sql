create table cliente(
	cod_cliente int,
	nome_cliente varchar(50),
	profissao varchar(50),
	endereco varchar(50),
	
	primary key(cod_cliente)
);
create table agencia(
	cod_agencia int,
	agencia varchar(50),
	endereco varchar(50),
	
	primary key(cod_agencia)
);
create table conta(
	num_conta int,
	tipo_conta varchar(50),
	cod_cliente int,
	cod_agencia int,
	saldo float,
	
	primary key(num_conta),
	foreign key(cod_cliente)references cliente(cod_cliente),
	foreign key(cod_agencia)references agencia(cod_agencia)
);
create table emprestimo(
	num_emprestimo int,
	cod_cliente int,
	cod_agencia int,
	valor float,
	
	primary key(num_emprestimo),
	foreign key(cod_cliente)references cliente(cod_cliente),
	foreign key(cod_agencia)references agencia(cod_agencia)
);

insert into cliente
values
(123, 'Matheus', 'Java Developer', 'Planaltina'),
(321, 'Pedro', 'Python Developer', 'Braga city'),
(312, 'Luciana', 'Engenheira', 'Sao Paulo'),
(213, 'Luciana', 'Medica', 'Sao Paulo'),
(132, 'Murilo', 'Psicologo', 'Brasilia'),
(33312, 'Henrique', 'Pintor', 'Sao Paulo'),
(12211, 'Natan', null, 'Sao Paulo');

insert into agencia
values
(111, 'Agencia1', 'Rua1'),
(222, 'Agencia2', 'Rua2'),
(2589, 'Agencia3', 'Rua3'),
(3366, 'Agencia4', 'Sao Paulo');

insert into conta
values
(1111, 'Normal', 123, 111, 90),
(2222, 'Normal', 321, 222, 150),
(3333, 'Normal', 312, 2589, 500)
(4444, 'Premium', 213, 2589, 320),
(5555, 'Normal', 132, 2589, 120),
(6666, 'Normal', 33312, 3366, 490),
(7777, 'Premium', 12211, 111, 1800);

insert into emprestimo
values
(1122, 123, 222, 701),
(2211, 132, 2589, 500),
(1212, 312, 2589, 800);





/*1. Quais os clientes (cod_cliente e cliente) deste Banco?*/
select cod_cliente, nome_cliente from cliente ;

/*2. Quais os clientes que residem em Braga?*/
select * from cliente
where endereco like '%Braga%';

/*3. Quais os clientes (cod_cliente) com contas na agência 
cod_agencia = ‘2589?*/
select cliente.cod_cliente from cliente, conta ,agencia
where conta.cod_agencia = agencia.cod_agencia and cliente.cod_cliente = conta.cod_cliente and conta.cod_agencia = 2589;

/*4. Quais nomes dos clientes com contas na agência 
cod_agencia = ‘2589?*/
select nome_cliente from cliente, conta ,agencia
where conta.cod_agencia = agencia.cod_agencia and cliente.cod_cliente = conta.cod_cliente and conta.cod_agencia = 2589;

/*5. Repita a consulta 4, eliminando as linhas duplicadas*/
select distinct nome_cliente from cliente, conta ,agencia
where conta.cod_agencia = agencia.cod_agencia and cliente.cod_cliente = conta.cod_cliente and conta.cod_agencia = 2589;

/*6. Quais os clientes que residem em localidades onde 
existem agências?*/
select * from cliente, agencia
where cliente.endereco = agencia.endereco;

/*7. Quais os clientes com empréstimos de valor superior a 
700??*/
select * from cliente, emprestimo
where valor > 700 and cliente.cod_cliente = emprestimo.cod_cliente;

/*8. Quais os nomes dos clientes com empréstimos de valor 
superior a 700??*/
select nome_cliente from cliente, emprestimo
where valor > 700 and cliente.cod_cliente = emprestimo.cod_cliente;

/*9. Retorne o nome do cliente e o nome da agencia onde 
fez o empréstimo de valor superior a 700*/
select nome_cliente, agencia from cliente, emprestimo, agencia
where valor > 700 and cliente.cod_cliente = emprestimo.cod_cliente and emprestimo.cod_agencia = agencia.cod_agencia;

/*10. Listar as contas (num_conta, saldo) da agência cujo 
cod_agencia = ‘2589’, por ordem decrescente do seu valor 
de saldo.*/
select num_conta, saldo from agencia, conta 
where agencia.cod_agencia = 2589 and conta.cod_agencia = agencia.cod_agencia order by saldo desc;

/*11. Quais os clientes cuja profissão é desconhecida?*/
select * from cliente
where profissao is null;

