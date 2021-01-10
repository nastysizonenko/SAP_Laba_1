-- раскомментируйте следующую строку, если требуется пересоздать таблицу
-- drop table employee;
-- создание таблицы
create table employee(id integer,
first_name varchar(20),
last_name varchar(20),
designation varchar(20),
phone varchar(20));
--вставка тестовых данных
insert into employee values (1, 'Nenci', 'Druy', 'Programmer', '+7 (978) 001-0101');
insert into employee values (2, 'Tina', 'Freenv', 'Driver', '+7 (978) 002-0202');
insert into employee values (3, 'Ivan', 'Weent', 'Technician', '+7 (978) 003-0303');
insert into employee values (4, 'Peter', 'Hardi', 'Manager', '+7 (978) 004-0404');
insert into employee values (5, 'Victoria', 'Blan', 'Director', '+7 (978) 005-0505');
-- выбрать все записи из таблицы для проверки
select * from employee;