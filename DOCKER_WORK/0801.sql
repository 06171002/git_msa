use madangdb;

-- 각 고객이 구매한 도서의 총 개수를 구하고, 구매한 도서 개수가 3개 이상인 고객의 이름과 구매 도서 개수를 출력하세요.
select c.name, count(b.bookid)
from orders o inner join customer c on c.custid=o.custid inner join book b on b.bookid=o.bookid
group by c.name;

select c.name, count(b.bookid)
from orders o inner join customer c on c.custid=o.custid inner join book b on b.bookid=o.bookid
group by c.name
having count(b.bookid) >= 3;

-- 각 출판사별로 출판된 도서 중 가장 비싼 도서의 이름과 가격을 출력하세요.
select b.publisher, b.bookname, max(b.price)
from book b
group by b.publisher,b.bookname;

select max(b.price)
from book b
group by b.publisher;

select  b.bookname, b.price
from book b
where b.price in (select max(b.price)
from book b
group by b.publisher)
order by b.price;

-- 가장 많은 고객이 구매한 도서의 이름과 구매 고객 수를 출력하세요. (단, 동일한 구매 고객 수를 가진 도서가 여러 권인 경우 모두 출력합니다.)
select count(*)
from orders o inner join book b on b.bookid=o.bookid
group by b.bookname;






-- -----
select c.name,b.publisher
from customer c inner join orders o on c.custid=o.custid inner join book b on o.bookid=b.bookid
where b.publisher in (select b.publisher from book b inner join orders o on o.bookid=b.bookid inner join customer c on c.custid=o.custid and c.name='박지성');
-- -------
select c.name,count(*) as '출판사 수'
from customer c inner join orders o on c.custid=o.custid inner join book b on b.bookid=o.bookid
group by c.name
having count(*) > 1;
-- ---------
select b.publisher, count(*) as 'book'
from orders o inner join book b on b.bookid=o.bookid
group by b.publisher;

select o.saleprice, b.price, count(*)
from orders o inner join book b on b.bookid=o.bookid
group by o.saleprice,b.price;




-- ---------
select b.bookname, count(*)
from orders o inner join book b on o.bookid=b.bookid inner join customer c on c.custid=o.custid
group by b.bookname
having count(*) > 0.3*(select count(*) from customer);


-- ---------
select sum(saleprice)
from orders;

select c.name, round(avg(saleprice),-2)
from customer c inner join orders o on c.custid=o.custid
group by c.name;

select lower('A');
select upper('a');
select lpad('page',10,'*');
select replace('abcd','a','b');
select substr('abcde',2,4);

select b.bookname, b.publisher, length(b.bookname), char_length(b.bookname)
from book b
where b.publisher = '굿스포츠';

select substr(c.name,1,1), count(*)
from customer c
group by substr(c.name,1,1);

select substr(c.name,1,1) '성', count(*)
from customer c
group by 성;

select o.orderdate, adddate(o.orderdate, interval 10 day)
from orders o;
-- --------
select o.orderid, o.orderdate, o.custid, o.bookid, date_format(o.orderdate, '%y%m%d')
from orders o
where o.orderdate = str_to_date('20240707','%Y%m%d'); 

select o.orderid, o.orderdate, o.custid, o.bookid, date_format(o.orderdate, '%b%m%y')
from orders o
where o.orderdate = str_to_date('20240707','%Y%m%d'); 

select o.orderid, o.orderdate, o.custid, o.bookid, date_format(o.orderdate, '%y-%m-%d %a')
from orders o
where o.orderdate = str_to_date('20240707','%Y%m%d'); 

select o.orderid, o.custid '고객번호', o.bookid '책번호', date_format(o.orderdate, '%y%m%d') '주문일', date_format(o.orderdate, '%b%m%y') '주문일', date_format(o.orderdate, '%y-%m-%d %a') '주문일'
from orders o
where o.orderdate = str_to_date('20240707','%Y%m%d'); 
-- ----------
select o.orderid, o.orderdate, o.custid, o.bookid, date_format(o.orderdate, '%y%m%d')
from orders o
where o.orderdate = str_to_date('20240704','%Y%m%d'); 

select c.name, c.phone, ifnull(phone,'연락처 없음')
from customer c;

create view vorders
as
select o.orderid, o.custid, c.name, o.bookid, b.bookname, o.saleprice, o.orderdate
from orders o inner join customer c on c.custid=o.custid inner join book b on b.bookid=o.bookid;

select * from vorders;

create view vw
as
select * from customer where address like '%대한민국%';

select * from vw;

create view vie
as
select c.name,b.bookname from orders o inner join customer c on c.custid=o.custid inner join book b on b.bookid=o.bookid;

select orderid, bookname, saleprice
from vorders
where name = '김연아';

select orderid, bookname, saleprice
from (select o.orderid, o.custid, c.name, o.bookid, b.bookname, o.saleprice, o.orderdate
from orders o inner join customer c on c.custid=o.custid inner join book b on b.bookid=o.bookid)
where name = '김연아';


create or replace view vw
as
select c.name,c.address
from customer c
where c.address like '%영국%';

select * from vw;

select count(phone)
from customer;

select avg(saleprice)
from orders;

select o.orderid, o.saleprice
from orders o
where saleprice <= (select avg(saleprice) from orders);


create table mybook (bookid integer primary key, price integer);

insert into mybook values (1,10000);
insert into mybook values (2,20000);
insert into mybook values (3,null);
insert into mybook(bookid) values (4);


select* from mybook;

select price+100
from mybook
where bookid=3;

select sum(price),avg(price),count(*),count(price)
from mybook;

select sum(price),avg(price),count(*)
from mybook
where bookid >4;

select *
from mybook
where price is null;

select c.name, c.phone, ifnull(phone,'연락처 없음')
from customer c;

select bookid, ifnull(price,'가격미입력')
from mybook;

set @seq:=0;
select (@seq:=@seq+1) '순번', custid, name, phone
from customer
where @seq <4;


