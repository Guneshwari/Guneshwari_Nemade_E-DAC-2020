create database ass4;
use ass4;

create table Department ( dept_id integer(6) primary key,dept_name varchar(50));
insert into Department values(1,'finance');
insert into Department values(2,'training');
insert into Department values(3,'Marketing');
select * from Department;

create table Employee(
empid integer(5),
emp_name varchar(30),
dept_id integer(5),
salary integer(10), 
manager int(6),
FOREIGN KEY (dept_id) REFERENCES department(dept_id));

ALTER TABLE Department MODIFY dept_id integer(6) NOT NULL;
insert into Employee values (1,'Arun',1,8000,4);
insert into Employee values (2,'Kiran',1,7000,1);
insert into Employee values (3,'Scott',1,3000,1);
insert into Employee values (4,'Max',2,9000,1);
insert into Employee values (5,'Jack',2,8000,4);
insert into Employee values (6,'King', null,6000,1);

SELECT emp_name, dept_name FROM employee, department WHERE employee.dept_id= department.dept_id;

select * from employee,department where employee.dept_id = department.dept_id;

select dept_id,sum(salary) from employee group by (dept_id);

select dept_name,emp_name from department left outer join employee on department.dept_id = employee.dept_id;

select  dept_name,emp_name from department right outer join employee on department.dept_id = employee.dept_id;
 
select e.emp_name, m.emp_name from employee e join employee m on  m.manager = e.empid;

select e.emp_name,d.dept_id from employee e join employee d on d.dept_id = e.empid;

create table Emp1 (
emp_no integer(5),
emp_name varchar(25));

create table Emp2 (
emp_no integer(5),
emp_name varchar(25));

insert into Emp1 values(1,'A');
insert into Emp1 values(2,'B');
insert into Emp1 values(3,'C');

insert into Emp2 values(1,'A');
insert into Emp2 values(2,'B');
insert into Emp2 values(4,'D');
insert into Emp2 values(5,'E');

SELECT * FROM EMP1 UNION SELECT * from EMP2;

SELECT EMP_NAME,SALARY FROM EMPLOYEE WHERE SALARY = (SELECT SALARY FROM EMPLOYEE WHERE EMP_NAME = "ARUN");

SELECT EMP_NAME,DEPT_ID FROM EMPLOYEE WHERE DEPT_ID = (SELECT DEPT_ID FROM EMPLOYEE WHERE EMP_NAME = 'JACK');

SELECT EMP_NAME,SALARY FROM EMPLOYEE WHERE SALARY = (SELECT MIN(SALARY) FROM EMPLOYEE );

update employee set salary = 15000 where dept_id =2;
select * from employee;

