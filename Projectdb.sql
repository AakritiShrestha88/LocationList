create database projectdb;
use projectdb;

create table location(
id int PRIMARY KEY AUTO_INCREMENT,
code VARCHAR(20),
name varchar(30),
type varchar(20));
show tables;
select * from location;
delete from location where id=0;



select type,count(type) from location group by type;