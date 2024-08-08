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


