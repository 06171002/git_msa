set @seq := 0;
select (@seq := @seq+1) '순번', custid,name,phone
from customer
where @seq < 2;

select sum(saleprice)
from orders
where custid = (select custid
from customer
where name = '박지성');

select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice)
from orders);

select orderid, custid, saleprice
from orders o1
where saleprice > (select avg(saleprice)
from orders o2
where o1.custid= o2.custid);

select avg(saleprice)
from orders;

select avg(o1.saleprice)
from orders o1, orders o2
where o1.custid=o2.custid;

select * from orders o1;

select orderid, custid, saleprice
from orders o1
where saleprice > (select avg(saleprice)
from orders o2
where o1.custid= o2.custid);

select sum(saleprice)
from orders o inner join customer c on c.custid=o.custid
where c.address like '%대한민국%';


