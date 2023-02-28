-- 1.a
select current_timestamp;

-- 1.b
select sqrt(49);

-- 1.c
select current_database();
select current_schema;

-- 1.d
select current_user;

-- 2
create sequence minha_seq
increment by 10
minvalue 1
maxvalue 100

-- 3.a
select nextval('minha_seq');

-- 3.b
select nextval('minha_seq');

-- 3.c
select setval('minha_seq', 50);

-- 3.d
select setval('minha_seq', 100);
select nextval('minha_seq');

-- 3.e
alter sequence minha_seq
increment by 1
cycle

-- 3.f
select setval('minha_seq', 100);
select nextval('minha_seq');

drop sequence minha_seq

-- 4
create table dados_multimidia(
	codigo serial, 
	nome varchar(15),
	tipo varchar(15),
	tipooid_dados oid,
	
	primary key (codigo)
);

-- 5
select setval('minha_seq', 1);
insert into dados_multimidia
values
(nextval('minha_seq'), 'cafe', 'imagem', lo_import('C:\Users\Public\Pictures\cafe.jpg'))
 
-- 6

select * from dados_multimidia;
select * from pg_largeobject;

-- 7
select lo_export(tipooid_dados, 'C:\Users\Public\Pictures\nova_imagem.jpg')
from dados_multimidia
where nome = 'cafe';











