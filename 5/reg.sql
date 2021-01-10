connect
'jdbc:derby://localhost:1527/5;create=true;user=root;password=toor';
-- создание таблицы
create table registration_info(first_name varchar(20), last_name varchar(20),
organization varchar(100), report_theme varchar(300), email varchar(20));
-- отключение и выход
disconnect;
exit;