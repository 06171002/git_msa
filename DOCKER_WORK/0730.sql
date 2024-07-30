select custid, count(*) as '총 수량', sum(saleprice)
from orders 
where saleprice >= 8000
group by custid
having count(*)>=2;

select *
from customer,orders;

select *
from customer,orders
where customer.custid = orders.custid
order by customer.custid;

select *
from book,orders
where book.bookid=orders.bookid;

select custid, 
count(*) as '총 수량', 
sum(saleprice) '총 판매액'
from orders group by custid;

select name, sum(saleprice)
from customer, orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

select name,count(*) as '도서수량'
from customer, orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

select name,count(*) as '도서수량'
from customer, orders
where customer.custid=orders.custid and saleprice >= 8000 
group by customer.name
order by customer.name;

select name,count(*) as '도서수량'
from customer, orders
where customer.custid=orders.custid and saleprice >= 8000 
group by customer.name
having count(*)>=2;

select name
from customer, orders
where customer.custid=orders.custid
group by customer.name
order by customer.name;

select customer.name,book.bookname
from customer,orders,book
where customer.custid=orders.custid and orders.bookid = book.bookid;

