-- 어제 배운거
select C.name, B.bookname
from customer C, book B, orders O
where C.custid=O.custid and B.bookid=O.bookid;

-- new
select C.name, B.bookname
from book B, customer C
where (C.custid ,B.bookid) in (select custid, bookid from orders);

-- 달라유
select C.name,B.bookname
from customer C, book B
where C.custid in (select custid from orders) and B.bookid in (select bookid from orders);

