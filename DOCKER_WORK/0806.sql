create database madanguni;
use madanguni;

create table professor (
prof_id bigint primary key,
ssn varchar(20) not null,
name varchar(20) not null,
age tinyint null,
p_rank varchar(20) null,
speciality varchar(20) null);

create table department (
depart_id bigint primary key,
dno integer not null,
dname varchar(20) not null,
office varchar(20) null,
prof_id bigint not null,
foreign key (prof_id) references professor(prof_id));

create table graduate (
gra_id bigint primary key,
ssn varchar(20) not null,
name varchar(20) not null,
age tinyint not null,
deg_prog varchar(20) not null,
advisor varchar(20) null,
depart_id bigint not null,
foreign key (depart_id) references department(depart_id));

create table project (
pid bigint primary key,
sponsor varchar(20) not null,
start_date date not null,
end_date date not null,
budget bigint not null,
prof_id bigint not null,
foreign key (prof_id) references professor(prof_id));

create table workdept (
id bigint primary key,
depart_id bigint not null,
prof_id bigint not null,
constraint workpd unique (depart_id,prof_id),
foreign key (depart_id) references department(depart_id),
foreign key (prof_id) references professor(prof_id));

create table workin (
id bigint primary key,
prof_id bigint not null,
pid bigint not null,
constraint workpp unique (prof_id,pid),
foreign key (prof_id) references professor(prof_id),
foreign key (pid) references project(pid));

create table workprog (
id bigint primary key,
gra_id bigint not null,
pid bigint not null,
constraint workpg unique (gra_id,pid),
foreign key (gra_id) references graduate(gra_id),
foreign key (pid) references project(pid));