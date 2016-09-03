-- PotgreSql--

CREATE ROLE taptigin LOGIN
  ENCRYPTED PASSWORD '123'
  SUPERUSER INHERIT CREATEDB CREATEROLE REPLICATION;

CREATE DATABASE students
  WITH OWNER = taptigin
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Russian_Russia.1251'
       LC_CTYPE = 'Russian_Russia.1251'
       CONNECTION LIMIT = -1;

create TABLE orderTable
(ID bigint primary key not null, CustomerName varchar(80),
 CustomerAddress varchar(80),TotalAmount int,
 CreatedDate date);

create SEQUENCE orderSeq
START with 1
increment by 1
maxvalue 100000
minvalue 0;
	
insert into orderTable VALUES (nextval('orderSeq'),'Автоваз','г.Тольятти',100000,'1995-11-27');
insert into orderTable VALUES (nextval('orderSeq'),'Останкино','г.Москва',75000,'2000-02-12');
insert into orderTable VALUES (nextval('orderSeq'),'Пекарня','г.Ростов',12300,'2015-08-01');
insert into orderTable VALUES (nextval('orderSeq'),'Художественный магазин','г.Тольятти',15,'2016-09-01');
insert into orderTable VALUES (nextval('orderSeq'),'Магазин игрушек','г.Казань',1200,'2015-07-20');


create table orderDetails  
(ID bigint primary key not null,
 ProductSerialNumber varchar(120),
 ProductName varchar(60),
 Amount int,
 OrderID bigint references orderTable(ID) not null);

create SEQUENCE orderDetailsSeq
START with 1
increment by 1
maxvalue 100000
minvalue 0;

insert into orderDetails values (nextval('orderDetailsSeq'),'Кол-1','Колесо',32000,1);
insert into orderDetails values (nextval('orderDetailsSeq'),'КПП-12','Коробка передач',12000,1);
insert into orderDetails values (nextval('orderDetailsSeq'),'Р-5','Руль',500,1);

insert into orderDetails values (nextval('orderDetailsSeq'),'РП','Репортаж',900,2);
insert into orderDetails values (nextval('orderDetailsSeq'),'РК','Реклама',500,2);

insert into orderDetails values (nextval('orderDetailsSeq'),'ХБ','Хлеб',1300,3);

insert into orderDetails values (nextval('orderDetailsSeq'),'К1','Карандаш',50,4);
insert into orderDetails values (nextval('orderDetailsSeq'),'К2','Кисть',60,4);

insert into orderDetails values (nextval('orderDetailsSeq'),'ПлюшИгрушка','Медведь',2,5);
insert into orderDetails values (nextval('orderDetailsSeq'),'ПлюшИгрушка','Слон',3,5);
insert into orderDetails values (nextval('orderDetailsSeq'),'Игра','Тетрис',500000,5);






