select *
from customer,orders
where customer.custid=orders.orderid;

select *
from customer,orders;

select *
from customer,orders
where customer.custid = orders.custid
order by customer.custid;

select *
from customer,orders
where customer.custid = orders.custid
order by orders.custid;

select address
from customer, orders
where customer.custid=orders.custid
group by customer.address;

select name
from customer, orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

select address,count(*) as '도서수량'
from customer, orders
where customer.custid=orders.custid and saleprice >= 8000 
group by customer.address
having count(*)>=2;

select name,count(*) as '도서수량',sum(saleprice)
from customer, orders
where customer.custid=orders.custid 
group by customer.name
having count(*)>=2;

select customer.name,book.bookname
from customer,orders,book
where customer.custid=orders.custid and orders.bookid = book.bookid
group by customer.name,book.bookname;

select name,bookname
from customer,orders,book
where customer.custid=orders.custid and orders.bookid = book.bookid
order by book.bookname;

select customer.name,book.bookname
from customer,orders,book
where customer.custid=orders.custid and orders.bookid = book.bookid
order by customer.name;

select customer.name,book.bookname
from customer,orders,book
where customer.custid=orders.custid 
and orders.bookid = book.bookid 
and book.price=20000;
--  -----------------------------------------------------------------------------
-- 도서번호 1번
select book.bookname
from book
where bookid =1;

-- 가격 2만원 도서이름
select book.bookname
from book
where price >= 20000;

-- 박지성 총구매금액
select sum(saleprice)
from orders, customer
where orders.custid=customer.custid and customer.name = '박지성';

-- 박지성 구매도서 수
select count(bookid)
from orders, customer
where orders.custid=customer.custid and customer.name = '박지성';

-- 박지성 구매 도서 출판사 수
select count(publisher)
from orders, customer,book
where orders.custid=customer.custid and orders.bookid = book.bookid and customer.name = '박지성';

-- 박지성 구매 도서이름,정가와 가격차이
select book.bookname, book.price
from orders,book,customer
where orders.bookid=book.bookid and orders.custid=customer.custid and customer.name = '박지성'
group by book.bookname;

-- 박지성이 구매하지 않은 도서이름
select bookname
from orders,book,customer
where orders.bookid=book.bookid 
and orders.custid=customer.custid 
and name not in ('박지성');


-- 마당서점 도서 총개수
select count(*)
from book
where bookid;

-- 출판사 개수
select count(distinct publisher)
from book;


-- 모든 고객이름 주소
select customer.name, customer.address
from customer;

-- 7월 4일부터 7월7일 사이 주문 목록
select book.bookname
from orders,book
where orders.bookid=book.bookid 
and orderdate between '2024-07-04' and '2024-07-07';


-- 성이 김씨 이름 주소
select customer.name, customer.address
from customer
where customer.name like '김%';

-- 성이 김씨 이름이 아로 끝나는 이름 주소
select customer.name, customer.address
from customer
where customer.name like '김%아';

-- 주문금액 총액 평균
select sum(saleprice), avg(saleprice)
from orders;

-- 이름 구매액
select customer.address, sum(saleprice)
from customer, orders
where orders.custid=customer.custid
group by customer.address;

select customer.address, sum(saleprice)
from customer, orders
where orders.custid=customer.custid
group by customer.address;

-- 고객이름 구매도서 목록
select customer.name, book.bookname
from customer,orders,book
where customer.custid=orders.custid 
and orders.bookid = book.bookid
group by customer.name, book.bookname
order by customer.name;

select customer.name, book.bookname
from customer,orders,book
where customer.custid=orders.custid 
and orders.bookid = book.bookid
group by customer.name, book.bookname;

select max(price)
from book;

select bookname
from book 
where price = (select max(price)
from book);

select customer.name
from orders, customer
where orders.custid = customer.custid
group by customer.name;

select custid
from orders;

select name
from customer
where custid in (select custid from orders);



