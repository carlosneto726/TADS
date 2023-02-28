-- 1
--create database universidade;

-- 2
create table disciplina(
	codigo int,
	nome varchar(60),
	carga_horaria int, 
	
	primary key (codigo)
);


create table curso(
	codigo int, 
	nome varchar(60),
	
	primary key (codigo)
);


create table sala(
	codigo int, 
	capacidade int,
	
	primary key (codigo)
);


create table turma(
	ano_semestre varchar(15),
	codigo_sala int,
	cod_disciplina int, 
	capacidade int,
	
	primary key (ano_semestre),
	foreign key (codigo_sala) references sala (codigo) on delete cascade,
	foreign key (cod_disciplina) references disciplina (codigo) on delete cascade
);


create table curriculo(
	cod_curso int,
	cod_disciplina int,
	
	primary key (cod_curso, cod_disciplina),
	foreign key (cod_curso) references curso (codigo) on delete cascade,
	foreign key (cod_disciplina) references disciplina (codigo) on delete cascade

);


create table laboratorio(
	equipamento varchar(20),
	cod_sala int,
	
	primary key (equipamento),
	foreign key (cod_sala) references sala (codigo)
);


-- 3
alter table curso add column coordenador varchar(30);


-- 4
insert into disciplina (codigo, nome, carga_horaria)
values
(100, 'BANCO_DE_DADOS', 120),
(122, 'ARTES_MARCIAIS', 80),
(133, 'CONTABILIDADE', 80),
(144, 'ILUSTRACAO', 120),
(155, 'CONFEITARIA', 120),
(166, 'GENETICA', 50),
(177, 'PRE-HISTORIA_GERAL', 60),
(188, 'MECANICA', 80),
(199, 'ORQUESTRACAO', 80),
(200, 'ETICA', 60);


insert into curso(codigo, nome, coordenador)
values 
(25, 'TADS', 'LUFFY'),
(26, 'EDUCACAO_FISICA', 'ZORO'),
(27, 'GESTAO_FINANCEIRA', 'NAMI'),
(28, 'ARTES', 'USOPP'),
(29, 'GASTRONOMIA', 'SANJI'),
(30, 'MEDICINA', 'CHOPPER'),
(31, 'ARQUEOLOGIA', 'ROBIN'),
(32, 'ENGENHARIA', 'FRANKY'),
(33, 'MUSICA', 'BROOK'),
(34, 'CIENCIAS_HUMANAS', 'JINBE');


insert into sala(codigo, capacidade)
values
(072, 35),
(073, 35),
(074, 30),
(075, 35),
(076, 50),
(077, 45),
(078, 30),
(079, 35),
(080, 30),
(081, 30);


insert into turma(ano_semestre, codigo_sala, cod_disciplina, capacidade)
values
('2017/2', 072, 100, 25),
('2018/1', 073, 122, 25),
('2018/2', 074, 133, 20),
('2019/1', 075, 144, 30),
('2019/2', 076, 155, 25),
('2020/1', 077, 166, 25),
('2020/2', 078, 177, 30),
('2021/1', 079, 188, 40),
('2021/2', 080, 199, 25),
('2022/1', 081, 200, 20);


insert into curriculo(cod_curso, cod_disciplina)
values
(25 , 100),
(26 , 122),
(27 , 133),
(28 , 144),
(29 , 155),
(30 , 166),
(31 , 177),
(32 , 188),
(33 , 199),
(34 , 200);


insert into laboratorio(equipamento, cod_sala)
values
('COMPUTADORES' ,072),
('ANILHAS' ,073),
('CALCULADORAS' ,074),
('TINTAS' ,075),
('PANELAS' ,076),
('BISTURIS' ,077),
('PINCEIS' ,078),
('REGUAS' ,079),
('VIOLINOS' ,080),
('LIVROS' ,081);

-- 5a
update sala set capacidade = 50
where codigo = 081;

-- 5b
update curso set nome = 'Sistemas de Informação'
where codigo = 34;


-- 6
alter table turma drop column
capacidade cascade;

-- 7
delete from disciplina
where nome = 'BANCO_DE_DADOS';

-- 8
truncate table turma, sala, laboratorio, disciplina
cascade;

-- 9

drop table disciplina, curso, sala, turma, curriculo, laboratorio;









