-- 1 Apresente a sintaxe do comando da linguagem DDL para criar as tabelas apresentadas no modelo acima
create table cliente(
	cpf int,
	nome varchar(60),
	dtNasc date,
	
	primary key(cpf)
);


create table modelo(
	codMod int,
	descricao varchar(40),
	
	primary key(codMod)
);


create table patio(
	num int,
	ender varchar(40),
	capacidade int,
	
	primary key(num)
);


create table veiculo(
	placa varchar(8),
	modelo_codMod int,
	cliente_cpf int,
	cor varchar(20),
	ano int,
	
	
	primary key (placa),
	foreign key (modelo_codMod) references modelo(codMod),
	foreign key (cliente_cpf) references cliente(cpf)
);


create table estaciona(
	cod int,
	patio_num int,
	veiculo_placa varchar(8),
	dtEntrada varchar(10),
	dtSaida varchar(10),
	hsEntrada varchar(10),
	hsSaida varchar(10),
	
	primary key (cod),
	foreign key (patio_num) references patio(num),
	foreign key (veiculo_placa) references veiculo(placa)
);

-- 2 Usando a linguagem SQL, insira 8 registros nas tabelas criadas.
insert into cliente(cpf, nome, dtNasc)
values
(1234, 'Kakarotto', '1980-09-26'),
(2345, 'Vegetta', '1985-03-12'),
(3456, 'Bardock', '1968-12-01'),
(4567, 'Trunks', '2002-02-22'),
(5678, 'Gohan', '1995-05-20'),
(6789, 'Goten', '2002-09-26'),
(7890, 'Broly', '1981-07-13'),
(8901, 'Raditz', '1978-01-30');


insert into modelo(codMod, descricao)
values
(111, 'NISSAN SKYLINE'),
(222, 'TOYOTA SUPRA'),
(333, 'FORD MUSTANG'),
(444, 'NISSAN 350z'),
(555, 'LAMBORGHINI MURCIELAGO'),
(666, 'PORSCHE PANAMERA'),
(777, 'MITSUBISHI EVO'),
(888, 'BUGATTI CHIRON');


insert into patio(num, ender, capacidade)
values
(100, 'RUA 1', 15),
(101, 'RUA 2', 10),
(102, 'RUA 3', 10),
(103, 'RUA 4', 10),
(104, 'RUA 5', 20),
(105, 'RUA 6', 15),
(106, 'RUA 7', 15),
(107, 'RUA 8', 20);


insert into veiculo (placa, modelo_codMod, cliente_cpf, cor, ano)
values 
('BRS-2021', 111, 1234, 'LARANJA', 2003),
('VEG-2011', 222, 2345, 'AZUL', 2005),
('BAR-2012', 333, 3456, 'VERMELHO', 2012),
('TRU-2013', 444, 4567, 'ROXO', 2010),
('GOH-2014', 555, 5678, 'BRANCO', 2009),
('GOT-2015', 666, 6789, 'AMARELO', 2015),
('BRO-2016', 777, 7890, 'VERDE', 2013),
('RAD-2017', 888, 8901, 'PRETO', 2018),
('AAA-2022', 111, 1234, 'VERDE', 1980),
('BBB-2022', 222, 1234, 'VERDE', 1981),
('CCC-2022', 333, 1234, 'VERDE', 1982);


insert into estaciona(cod, patio_num, veiculo_placa, dtEntrada, dtSaida, hsEntrada, hsSaida)
values
(04, 100, 'CCC-2022', '25-01-2022', '25-01-2022', '12:30', '13:40'),
(13, 100, 'BRS-2021', '23-01-2022', '23-01-2022', '13:30', '15:10'),
(14, 100, 'VEG-2011', '25-01-2022', '25-01-2022', '13:00', '16:55'),
(15, 100, 'BAR-2012', '24-01-2022', '24-01-2022', '13:05', '18:15'),
(16, 100, 'TRU-2013', '25-01-2022', '25-01-2022', '12:30', '13:40'),
(17, 104, 'GOH-2014', '25-01-2022', '25-01-2022', '16:00', '16:15'),
(18, 105, 'GOT-2015', '24-01-2022', '24-01-2022', '15:25', '16:25'),
(19, 106, 'BRO-2016', '25-01-2022', '25-01-2022', '16:25', '17:00'),
(20, 107, 'RAD-2017', '26-01-2022', '26-01-2022', '18:10', '18:25'),
(05, 100, 'BRS-2021', '23-01-2022', '23-01-2022', '13:30', '15:10'),
(06, 100, 'VEG-2011', '25-01-2022', '25-01-2022', '13:00', '16:55'),
(07, 100, 'BAR-2012', '24-01-2022', '24-01-2022', '13:05', '18:15'),
(08, 100, 'TRU-2013', '25-01-2022', '25-01-2022', '12:30', '13:40'),
(09, 100, 'GOH-2014', '25-01-2022', '25-01-2022', '16:00', '16:15'),
(10, 100, 'GOT-2015', '24-01-2022', '24-01-2022', '15:25', '16:25'),
(11, 106, 'BRO-2016', '25-01-2022', '25-01-2022', '16:25', '17:00'),
(12, 107, 'RAD-2017', '26-01-2022', '26-01-2022', '18:10', '18:25'),
(123, 107, 'AAA-2022', '26-01-2022', '26-01-2022', '18:10', '18:25');


-- 3 Acrescente a coluna endereco do tipo VARCHAR(80) na tabela Cliente.
alter table cliente
add column endereco varchar(80);


-- 4 Para todos os pátios com número igual a 100 modifique sua capacidade para 45.
update patio
set capacidade = 45
where num = 100;


-- 5a Exiba o CPF e o nome do cliente que possui o veículo de placa “BRS2021”. Use o conceito de consultas aninhadas.
select cliente_cpf, nome from veiculo, cliente
where placa = 'BRS-2021' and cliente_cpf = cpf; 


-- 5b Exiba o nome do cliente que possui o veículo cujo código do estacionamento é “os dois primeiros números da sua matrícula”. Use INNER JOIN.
select nome from cliente
inner join veiculo
on cpf = cliente_cpf
inner join estaciona
on placa = veiculo_placa
where cod = 20;


-- 5c Exiba a quantidade de carros estacionados por pátio. O resultado deverá ter o número do pátio e a respectiva quantidade.
select 
patio_num,
count(patio_num) as Quantidade
from estaciona
group by patio_num;


-- 5d Exiba os pátios e a quantidade de carros estacionados para os pátios que possuem mais que 10 carros estacionados.
select
patio_num,
count(patio_num) as Quantidade
from estaciona
group by patio_num
having count(patio_num) > 10;


-- 5e Exiba a placa, ano e o código de estacionamento de todos os veículos cadastrados. Os veículos cadastrados que não estiverem estacionados apresentar o valor NULL para o campo código de estacionamento. Use OUTER JOIN.
select placa, ano, cod from veiculo
full outer join estaciona
on placa = veiculo_placa;


-- 5f Exclua todos os registros da tabela Estaciona
truncate table estaciona;


-- 5g Exiba a placa, o ano do veículo e a descrição de seu modelo, se ele possuir ano a partir de 2000. Use INNER JOIN.
select placa, ano, descricao from veiculo
inner join modelo
on ano >= 2000;


-- 5h Exiba a quantidade de vezes que os veículos de cor verde estacionaram. Use INNER JOIN
select
count(veiculo_placa) as Quantidade
from estaciona
inner join veiculo
on placa = veiculo_placa
where cor = 'VERDE';


-- 5i Exiba a descrição do modelo do veículo cujo código do estacionamento é 123.

select descricao from modelo, estaciona, veiculo
where cod = 123 and modelo_codMod = codMod and placa = veiculo_placa;


drop table cliente, modelo, patio, veiculo, estaciona;
