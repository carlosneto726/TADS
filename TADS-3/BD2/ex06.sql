
create schema Banco_de_Dados;
show search_path;
set search_path to Banco_de_Dados;

create table banco(
	codigo integer not null,
	nome varchar(50),
	primary key(codigo)
)

create table agencia(
	codigo_banco integer not null,
	num_agencia integer not null,
	endereco varchar(100),
	
	primary key(num_agencia),
	foreign key(codigo_banco) references banco(codigo) 
)

create table cliente(
	cpf varchar(14) not null,
	sexo char(1),
	nome varchar(50),
	endereco varchar(100),
	primary key(cpf)
)

create table conta(
	numero_conta varchar(7) not null,
	saldo float,
	tipo_conta integer,
	num_agencia integer not null,
	
	primary key(numero_conta),
	foreign key(num_agencia) references  agencia(num_agencia)
)

create table historico(
	cpf_cliente varchar(14) not null,
	numero_conta varchar(7) not null,
	data_inicio date,
	
	primary key(cpf_cliente, numero_conta),
	foreign key(cpf_cliente) references cliente(cpf),
	foreign key(numero_conta) references conta(numero_conta)
)

create table telefone_cliente(
	cpf_cli varchar(14) not null,
	telefone_cli varchar(20) not null,
 	
	primary key(telefone_cli, cpf_cli),
	foreign key(cpf_cli) references cliente(cpf)
)






insert into banco(codigo, nome)
values
(1, 'Banco do Brasil'),
(4, 'CEF');

insert into agencia(num_agencia, endereco, codigo_banco)
values
(0562, 'Rua Joaquim, Teixeira, Alves, 1555', 4),
(3153, 'Av. Marcelino Pires, 1960', 1);

insert into cliente(cpf, sexo, nome, endereco)
values
('111.222.333-44', 'F', 'Jennifer b Souza',  'Rua Cuiabá, 1050'),
('666.777.888-99', 'M', 'Caetano K Lima',  'Rua Ivinhema, 879'),
('555.444.777-33', 'F', 'Silva Macedo',  'Rua Estados Unidos, 735');

insert into conta(numero_conta, saldo, tipo_conta, num_agencia)
values
('86340-2', 763.05, 2, 3153),
('23584-7', 3879.12, 1, 0562);

insert into historico(cpf_cliente, numero_conta, data_inicio)
values
('111.222.333-44', '23584-7', '17-12-1997'),
('666.777.888-99', '23584-7', '17-12-1997'),
('555.444.777-33', '86340-2', '29-11-2010');


insert into telefone_cliente(cpf_cli, telefone_cli)
values
('111.222.333-44', '(67)3422-7788'),
('666.777.888-99', '(67)3423-9900'),
('666.777.888-99', '(67)8121-8833');
