create user madang@localhost identified by '1234';
use sys;
use mysql;
desc user;
select * from user;
create user madangguest@localhost identified by '1234';
drop user madangguest@localhost;
create user madangguest@localhost identified by '1234';
create user madangguest identified by '1234';
grant all privileges on madangdb.* to madangguest@localhost with grant option;
flush privileges;
show grants for madang@localhost;
grant select, update on madangdb.customer to madangguest@localhost;
revoke select on madangdb.customer from madangguest@localhost;
revoke all privileges on madangdb.* from madangguest@localhost;