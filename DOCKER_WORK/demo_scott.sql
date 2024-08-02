

use madangdb;

drop table if exists emp ;
drop table if exists dept;
drop table if exists salgrade;

CREATE TABLE IF NOT EXISTS DEPT (
  DEPTNO integer NOT NULL, 
  DNAME varchar(14), 
  LOC varchar(13), 
  PRIMARY KEY (DEPTNO)
);

INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES(40, 'OPERATIONS', 'BOSTON');

CREATE TABLE IF NOT EXISTS EMP (
  EMPNO integer NOT NULL PRIMARY KEY, 
  ENAME varchar(10), 
  JOB varchar(9), 
  MGR integer, 
  HIREDATE date, 
  SAL integer, 
  COMM integer, 
  DEPTNO integer, 
  FOREIGN KEY (deptno) REFERENCES Dept(deptno)
);

INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17 00:00:00', 800, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20 00:00:00', 1600, 300, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22 00:00:00', 1250, 500, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02 00:00:00', 2975, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28 00:00:00', 1250, 1400, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01 00:00:00', 2850, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09 00:00:00', 2450, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17 00:00:00', 5000, NULL, 10);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08 00:00:00', 1500, 0, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23 00:00:00', 1100, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03 00:00:00', 950, NULL, 30);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03 00:00:00', 3000, NULL, 20);
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23 00:00:00', 1300, NULL, 10);

CREATE TABLE IF NOT EXISTS SALGRADE(
	GRADE INTEGER, 
	LOSAL INTEGER, 
	HISAL INTEGER 
	);

INSERT INTO SALGRADE VALUES (1, 700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

create index ix_book on book(bookname);
create index ix_book2 on book(publisher,price);

-- 1) 사원의 이름과 직위를 출력하세요. 단 사원의 이름은 '사원이름', 직위는 '사원직위' 머리글이 나오도록 출력하세요.
select ename as 사원이름, job as 사원직위 
from emp;

-- 2) 30번 부서에 근무하는 모든 사원의 이름과 급여를 출력하세요.
select e.ename as 사원이름, e.sal as 급여 
from emp e
where e.deptno = 30;

-- 3) 사원번호와 이름, 현재 급여, 10% 인상된 급여(열 이름은 '인상된 급여'), 증가한 급여분(열 이름은 '증가액')을 사원번호순으로 출력하세요.
select e.empno, e.ename, e.sal '현재 급여', (sal*1.1) '인상된 급여', (sal*0.1)  "증가액" 
from emp e
order by empno;

-- 4) 'S'로 시작하는 모든 사원과 부서번호를 출력하세요.
select e.ename, e.deptno
from emp e
where ename like 'S%';

-- 5) 모든 사원의 최대 및 최소 급여, 합계 및 평균 급여를 출력하세요. 열 이름은 각각 MAX, MIN, SUM, AVG로 합니다. 단, 소수점 이하는 반올림하여 정수로 출력하세요.
select max(e.sal) '최대 급여', min(e.sal) '최소 급여', sum(e.sal) '합계', round(avg(e.sal)) '평균'
from emp e;
-- 6) 업무 이름과 업무별로 동일한 업무를 하는 사원의 수를 출력하세요. 열 이름은 각각 '업무'와 '업무별 사원수'로 합니다.
select e.job '업무', count(*) '업무별 사원수'
from emp e
group by e.job;
-- 7) 사원의 최대 급여와 최소 급여의 차액을 출력하세요.
select max(e.sal) - min(e.sal)
from emp e;
-- 8) 30번 부서의 구성원 수와 사원들 급여의 합계와 평균을 출력하세요.
select e.deptno, count(*), sum(e.sal), round(avg(e.sal))
from emp e
group by e.deptno
having e.deptno = 30;
-- 9) 평균 급여가 가장 높은 부서의 번호를 출력하세요.
select e.deptno, avg(e.sal)
from emp e
group by e.deptno 
order by avg(e.sal) desc limit 1;

select e.deptno, avg(e.sal)
from emp e
group by e.deptno;

select max(aver)
from (select e.deptno, avg(e.sal) as aver
from emp e
group by e.deptno) as cnt;

select e.deptno
from 
(select max(aver)
from (select e.deptno, avg(e.sal) as aver
from emp e
group by e.deptno) as cnt);

select max(cnt)
from (select o.custid, count(*) as cnt
		from orders o
		group by o.custid) as count;

-- 10) 세일즈맨(SALESMAN)을 제외하고, 업무별 사원의 급여가 3,000 이상인 각 업무에 대해서, 업무명과 업무별 평균 급여를 출력하세요. 단 평균 급여는 내림차순으로 출력합니다.
select e.job, avg(e.sal)
from emp e
group by e.job
having avg(e.sal) >= 3000
order by avg(e.sal) desc;
-- 11) 전체 사원 가운데 직속상관이 있는 사원의 수를 출력하세요.

-- 12) EMP테이블에서 이름, 겹여, 커미션(COMM)금액, 총액(SAL+COMM)을 구하여 총액이 많은 순서대로 출력하세요. 단 커미션이 NULL인 사람은 제외합니다.
select e.ename, e.sal, e.comm, sum(e.sal + e.comm)
from emp e
where e.comm is not null
group by e.ename, e.sal, e.comm
order by sum(e.sal+e.comm) desc;
-- 13) 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무이름, 인원수를 출력하세요.
select e.deptno, e.job, d.dname, count(*)
from emp e inner join dept d on d.deptno=e.deptno
group by e.deptno, e.job
order by e.deptno;
-- 14) 사원이 한 명도 없는 부서의 이름을 출력하세요.
select d.deptno, d.dname, count(e.deptno)
from dept d left outer join emp e on d.deptno=e.deptno
group by d.deptno
having count(e.deptno) = 0;
-- 15) 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원수를 출력하세요.
select e.deptno, count(*)
from emp e
group by e.deptno;

select d.deptno, d.dname, count(*)
from dept d inner join emp e on d.deptno=e.deptno
group by d.deptno, d.deptno
having count(*) > 3;

select e.job, count(*)
from emp e
group by e.job
having count(*) > 3;
-- 16) 사원번호가 7400이상 7600이하인 사원의 이름을 출력하세요.
select e.ename, e.empno
from emp e
where e.empno between 7400 and 7600;
-- 17
select e.ename, d.dname
from emp e inner join dept d on d.deptno=e.deptno;
-- 18*
select e.ename, e.mgr
from emp e;
-- 19
select e.sal
from emp e
where e.ename = 'scott';

select e.ename
from emp e
where e.sal > (select e.sal
from emp e
where e.ename = 'scott');
-- 20
select d.deptno
from dept d inner join emp e on d.deptno=e.deptno
where e.ename = 'scott' and d.loc = 'dallas';





select * from emp;
select * from dept;
select * from salgrade;