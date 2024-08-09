use hr;

CREATE TABLE regions (
	region_id INT UNSIGNED NOT NULL,
	region_name VARCHAR(25),
	PRIMARY KEY (region_id)
	);

CREATE TABLE countries (
	country_id CHAR(2) NOT NULL,
	country_name VARCHAR(40),
	region_id INT UNSIGNED NOT NULL,
	PRIMARY KEY (country_id)
);


CREATE TABLE locations (
	location_id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	street_address VARCHAR(40),
	postal_code VARCHAR(12),
	city VARCHAR(30) NOT NULL,
	state_province VARCHAR(25),
	country_id CHAR(2) NOT NULL,
	PRIMARY KEY (location_id)
	);

CREATE TABLE departments (
	department_id INT UNSIGNED NOT NULL,
	department_name VARCHAR(30) NOT NULL,
	manager_id INT UNSIGNED,
	location_id INT UNSIGNED,
	PRIMARY KEY (department_id)
	);

CREATE TABLE jobs (
	job_id VARCHAR(10) NOT NULL,
	job_title VARCHAR(35) NOT NULL,
	min_salary DECIMAL(8, 0) UNSIGNED,
	max_salary DECIMAL(8, 0) UNSIGNED,
	PRIMARY KEY (job_id)
	);

CREATE TABLE employees (
	employee_id INT UNSIGNED NOT NULL,
	first_name VARCHAR(20),
	last_name VARCHAR(25) NOT NULL,
	email VARCHAR(25) NOT NULL,
	phone_number VARCHAR(20),
	hire_date DATE NOT NULL,
	job_id VARCHAR(10) NOT NULL,
	salary DECIMAL(8, 2) NOT NULL,
	commission_pct DECIMAL(2, 2),
	manager_id INT UNSIGNED,
	department_id INT UNSIGNED,
	PRIMARY KEY (employee_id)
	);

CREATE TABLE job_history (
	employee_id INT UNSIGNED NOT NULL,
	start_date DATE NOT NULL,
	end_date DATE NOT NULL,
	job_id VARCHAR(10) NOT NULL,
	department_id INT (11) UNSIGNED NOT NULL
	);

ALTER TABLE job_history ADD UNIQUE INDEX (
	employee_id,
	start_date
	);
    
CREATE VIEW emp_details_view
AS
SELECT e.employee_id,
	e.job_id,
	e.manager_id,
	e.department_id,
	d.location_id,
	l.country_id,
	e.first_name,
	e.last_name,
	e.salary,
	e.commission_pct,
	d.department_name,
	j.job_title,
	l.city,
	l.state_province,
	c.country_name,
	r.region_name
FROM employees e,
	departments d,
	jobs j,
	locations l,
	countries c,
	regions r
WHERE e.department_id = d.department_id
	AND d.location_id = l.location_id
	AND l.country_id = c.country_id
	AND c.region_id = r.region_id
	AND j.job_id = e.job_id;


select * from countries;
select * from departments;
select * from employees;
select * from job_grades;
select * from job_history;
select * from jobs;
select * from locations;
select * from regions;
select * from emp_details_view;

-- 1
select count(*) from employees;
select count(*) from departments;
select count(*) from employees union select count(*) from departments;

-- 2
select employee_id, last_name, job_id, hire_date
from employees;

select e.last_name, e.job_id, j.job_title
from employees e inner join jobs j on e.job_id = j.job_id;

-- 3
select last_name, salary
from employees
where salary >= 12000;

-- 4
select last_name, department_id
from employees
where department_id = 20 or department_id = 50
order by last_name;

-- 5
select last_name
from employees
where last_name like '__a%';

-- 6
select job_id, count(job_id)
from employees
group by job_id;

-- 7
select max(salary), min(salary)
from employees;

select max(salary) - min(salary)
from employees;

-- 8
select e.last_name, e.job_id, e.department_id, d.department_name
from employees e inner join departments d on e.department_id = d.department_id inner join locations l on d.location_id = l.location_id
where l.city = 'toronto';

-- 1
select e.last_name, e.job_id, j.start_date
from employees e inner join job_history j on e.job_id = j.job_id
where last_name = 'matos' or last_name = 'taylor';

-- 2
select e.last_name, e.hire_date
from employees e
where date_format(e.hire_date,'%Y') = '1994';

select date_format(e.hire_date,'%Y')
from employees e;

-- 3
select e.last_name, e.job_id, e.salary
from employees e
where e.job_id in ('sa_rep','st_clerk') and e.salary not in (2500,3500,7000);

-- 4
select count(*) 'Number of Managers'
from employees e inner join jobs j on e.job_id = j.job_id
where j.job_title like '%manager%';

-- 5
select e.manager_id, min(e.salary) 
from employees e inner join jobs j on e.job_id = j.job_id
where j.job_title like '%manager%'
group by e.manager_id;

select e1.employee_id, min(e1.salary)
from employees e1, employees e2
where e1.manager_id = e2.employee_id and e2.employee_id = 100;

select e.first_name, e.job_id
from employees e inner join jobs j on e.job_id = j.job_id
where j.job_title like '%manager%';




select e.manager_id, count(*) 
from employees e inner join jobs j on e.job_id = j.job_id
where j.job_title like '%manager%'
group by e.manager_id;

-- 8
select e.department_id, e.last_name, e.job_id
from employees e inner join departments d on e.department_id = d.department_id;


-- 9
select e.last_name, e.salary
from employees e
where e.manager_id = 100;

-- 10
select e.job_id, d.department_id
from departments d inner join employees e on d.department_id = e.department_id
where e.job_id != 'st_clerk';


select length(last_name) + length(first_name)
from employees;

select e.employee_id, e.first_name, e.last_name
from employees e
where (length(e.last_name) + length(e.first_name)) >=8;

select count(*)
from employees e
where (length(e.last_name) + length(e.first_name)) >=8;

select e.employee_id, e.first_name, e.last_name
from emp_details_view e
where (length(e.last_name) + length(e.first_name)) >=8;

select count(*)
from emp_details_view e
where (length(e.last_name) + length(e.first_name)) >=8;

select *
from employees e
where e.first_name regexp '^[A-Z]';

select e.first_name, length(e.first_name), e.last_name
from employees e
where e.last_name like '_c%';

select length(l.street_address) , l.street_address
from locations l
order by length(l.street_address);

select min(length(l.street_address))
from locations l;

select *, length(l.street_address)
from locations l
order by length(l.street_address) limit 1;


select e.first_name, length(e.first_name)
from employees e
where e.first_name like 'A%' or e.first_name like 'J%' or e.first_name like 'M%';

select e.first_name
from employees e
where date_format(e.hire_date,'%Y') = 1987;

select e.first_name, e.hire_date, year(now()) - date_format(e.hire_date,'%Y')
from employees e; 

select street_address , length(street_address)
from locations
where length(street_address) in (select min(length(street_address))
from locations);

-- 사원번호 이름 급여 업무 입사일 상사 사원번호 이름 성과이름 연결alter
select concat(e1.last_name,e1.first_name), e1.employee_id, e2.employee_id '상사 사원번호'
from employees e1, employees e2
where e1.manager_id = e2.employee_id;

select concat(last_name,first_name)
from employees;

-- 연봉 보너스 100 급여 급여 보너스 100
select round(salary/12,0) 
from employees;

select concat(last_name,first_name) 'name', job_id, salary, salary + 100 ' Increased Salary', salary*12 + 100 'Increased Ann_Salary'
from employees;
-- 이름: 1 year salary = 연봉 
select concat(last_name, '   ','Year Salary=',salary)
from employees;
-- 부서별로 담당 업무 한번씩
select job_id, department_id
from employees
group by department_id, job_id
order by department_id;
-- 급여 7000 10000 성과이름 급여가 작은 순서대로
select concat(last_name,first_name), salary
from employees
where salary between 7000 and 10000
order by salary;
-- 성 중에 e 및 o 포함된 사원 e and o name
select concat(last_name,first_name) 'e and o name'
from employees
where substr(last_name,1) like ('%e%');

select employee_id, concat(last_name,first_name) 'e and o name'
from employees
where last_name like '%e%' or last_name like '%o%';
-- 1995년 5월 20일부터 1996년 5월 20일 사이에 고용된 사원 이름 사원번호 고용일자 입사일 빠른순서
select employee_id, concat(last_name,first_name), hire_date
from employees
where hire_date between '1995-05-20' and '1996-05-20'
order by hire_date; 
-- 수당을 받는 모든 사원 성과 이름 급여 업무 수당률 급여 큰 순서 수당률 큰 순서
select concat(last_name,first_name) 'name', salary, commission_pct
from employees
where commission_pct not in (0)
order by commission_pct;
-- 60번 it부서 사원의 급여 12.3% 인상하여 정수만 표시 사번, 이름 성 인상된 급여 
select concat(last_name,first_name) 'name', salary, round(salary*1.123,0) '12.3% 인상된 급여' , round(salary*1.123 - salary,0) '인상된 급여 - 이전 급여'
from employees; 

--  이름이 's'로 끝나는 각 사원의 이름과 업무를 다음의 예시와 같이 출력하세요. (예시 : Sigal Tobias is a PU_CLERK) 출력 시 성과 이름은 첫 글자를 대문자로, 업무는 모두 대문자로 출력하고 머리글은 Employee JOBs로 표시하세요. (18행)
select concat(last_name, first_name, ' is a ',job_id) 'Employee JOBs'
from employees
where first_name like '%s';

