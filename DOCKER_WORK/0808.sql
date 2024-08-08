use madangdb;

delimiter //
create procedure dorepeat(p1 int)
begin
set @x = 0;
repeat set @x = @x +1; until @x > p1 end repeat;
end //
delimiter ;

call dorepeat(1000);
select @x;

delimiter //
create procedure insertbook (
 in mybookid integer,
 in mybookname varchar(40),
 in mypublisher varchar(40),
 in myprice integer)
 begin
  insert into book(bookid, bookname, publisher, price)
  value (mybookid, mybookname, mypublisher, myprice);
  end;
  //
  delimiter ;
  
  call insertbook (13, '스포츠과학', '마당과학서적', 25000);
  select * from book;
  
  delimiter //
  create procedure bookinsertorupdate (
  mybookid integer,
  mybookname varchar(40),
  mypublisher varchar(40),
  myprice integer)
  begin
   declare mycount integer;
   select count(*) into mycount from book
   where bookname like mybookname;
   if mycount != 0 then
   SET SQL_SAFE_UPDATES=0;
   update book set price = myprice
   where bookname like mybookname;
   else
   insert into book(bookid, bookname, publisher, price)
  value (mybookid, mybookname, mypublisher, myprice);
  end if;
  end;
  //
  delimiter ;
  
  call bookinsertorupdate (15,'스포츠 즐거움','마당과학서적',25000);
   select * from book;
  call bookinsertorupdate (15,'스포츠 즐거움','마당과학서적',20000);
  
  set global log_bin_trust_function_creators=on;
  
  create table book_log(
  bookid_l integer,
  bookname_l varchar(40),
  publisher_l varchar(40),
  price_l integer);
  
  delimiter //
  create trigger afterinsertbook
  after insert on book for each row
  begin
  declare average integer;
  insert into book_log
  values(new.bookid,new.bookname,new.publisher,new.price);
  end;
  //
  delimiter ;
  
  insert into book values (14,'스포츠 과학1','이상미디어',25000);
  select * from book where bookid=14;
  select * from book_log where bookid_l=14;
  select * from book_log;