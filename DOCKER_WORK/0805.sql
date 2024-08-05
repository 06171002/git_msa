use madangdb;

show index from book;

create database highschool;

use highschool;

create table student( s_id integer auto_increment primary key not null, name varchar(40) not null, year integer not null default 2024, grade tinyint not null, class tinyint not null, stu_num tinyint not null, password varchar(20) not null default 1111);
create table teacher( tch_id varchar(20) not null primary key, password varchar(20) not null, name varchar(20) not null, subject varchar(20) not null, role char(1) default '4'); 
create table class(
c_id integer auto_increment primary key,
tch_id varchar(20) not null,
c_name varchar(20) not null, 
year integer not null, 
grade tinyint not null,
c_semester char(1) not null, 
class tinyint not null, 
c_date char(1) not null, 
time varchar(10) not null, 
classroom varchar(20) not null, 
foreign key (tch_id) references teacher(tch_id));

create table rollbook ( 
s_id integer not null, 
c_id integer not null,
primary key(s_id, c_id),
foreign key (s_id) references student(s_id),
foreign key (c_id) references class(c_id));

create table perform ( 
p_id integer auto_increment primary key,
p_title varchar(100) not null,
p_type char(1) null,
p_content tinytext not null,
p_kijun varchar(100) null,
p_starddate date not null,
p_enddate date not null,
c_id integer not null,
foreign key (c_id) references class(c_id));

create table score (  
s_id integer not null, 
p_id integer not null,
s_score integer not null,
s_check char(1) null,
s_checkdate date null,
primary key (s_id,p_id),
foreign key (s_id) references student(s_id),
foreign key (p_id) references perform(p_id));


