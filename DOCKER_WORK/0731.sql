select C.name
from customer C inner join orders O on C.custid=O.custid inner join book B on B.bookid=O.bookid
where B.publisher like '대한미디어';

select C.name
from  customer C
where C.custid in (select custid from orders);

select C.name, B.bookname
from book B, customer C
where (C.custid ,B.bookid) in (select custid, bookid from orders) and B.publisher='대한미디어';

select customer.name
from customer
where custid in (select custid from orders where bookid in (select bookid from book where publisher='대한미디어'));

explain analyze select C.name, count(*) as cnt
from customer C, orders O
where C.custid=O.custid
group by C.name
having cnt >=1;

select C.name
from customer C
where C.address like '%대한민국%';

select custid
from orders;

select C.name
from customer C
where custid in (select custid from orders);

select C.name
from customer C
where custid in (select custid from orders);


select C.name
from customer C
where C.address like '%대한민국%'
union
select C.name
from customer C
where custid in (select custid from orders);

select C.name
from customer C
where C.address like '%대한민국%'
union all
select C.name
from customer C
where custid in (select custid from orders);

select C.name
from customer C
where C.address like '%대한민국%'
union all
select B.bookname
from book B
where bookid in (select bookid from orders);

-- 대한민국에 거주 주문한 고객
select C.name
from customer C
where custid in (select custid from orders) and C.address like '%대한민국%';

select C.name, C.address
from customer C
where custid in (select custid from orders);

select C.name, C.address
from customer C
where exists (select * from orders od where C.custid=od.custid);




alter table newbook modify bookname varchar(20) not null;

drop table newbook;

insert into book(bookid, bookname,publisher,price)
value (11,'스포츠 의학','한솔의학서적',90000);


select *
from book B, customer C
where (C.custid ,B.bookid) in (select custid, bookid from orders);

-- 박지성이 구매한 도서의 출판사와 같은 출판사 도서를 구매한 고객이름
select B.publisher
from book B, customer C, orders O
where B.bookid=O.bookid and C.custid=O.custid and C.name='박지성';

select b.publisher
from book b, customer c, orders o
where b.bookid=o.bookid and c.custid=o.custid and c.name='박지성';

select c.name, b.publisher
from book b, customer c, orders o
where b.bookid=o.bookid and c.custid=o.custid
and publisher in (select b.publisher
from book b, customer c, orders o
where b.bookid=o.bookid and c.custid=o.custid and c.name='박지성');

select C.name
from customer C inner join orders O on C.custid=O.custid inner join book B on B.bookid=O.bookid
where B.publisher like '대한미디어';


select b.publisher
from book b inner join orders o on b.bookid=o.bookid inner join customer c on c.custid=o.custid
where c.name='박지성';

select c.name, b.publisher
from customer c inner join orders o on c.custid=o.custid inner join book b on b.bookid=o.bookid
where publisher in (select b.publisher
from book b inner join orders o on b.bookid=o.bookid inner join customer c on c.custid=o.custid
where c.name='박지성');

select publisher , name
from book, customer, orders
where book.bookid=orders.bookid 
and customer.custid=orders.custid 
and publisher in (select publisher
from book , customer , orders 
where  book.bookid= orders.bookid 
and customer.custid= orders.custid and name = '박지성' 
);


select B.publisher
from book B, customer C
where (C.custid ,B.bookid) in (select custid, bookid from orders) and C.name='박지성';



select B.bookname
from book B 
where bookid in (select B.publisher
from book B, customer C, orders O
where B.bookid=O.bookid and C.custid=O.custid and C.name='박지성');



-- 두개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select B.publisher, count(*)
from book B, orders O
where B.bookid=O.bookid
group by B.publisher;

select c.name, count(distinct publisher)
from customer c inner join orders o on c.custid=o.custid inner join book b on o.bookid=b.bookid
group by c.name
having count(distinct publisher)>1;


select name ,count(distinct publisher) as 종류
from book, customer, orders
where book.bookid=orders.bookid
and customer.custid= orders.custid
group by name
having count(distinct publisher)>1;



select count(*)
from customer;

select bookid
from book 
group by bookid
having count(*);


-- 전체 고객의 30%이상이 구매한 도서
select b.bookname
from book b 
where b.bookid




