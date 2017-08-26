-- 创建同义词
create synonym emp for scott.emp;
create synonym dept for scott.dept;

-- 创建视图 ( 1. 保存查询结果; 2. 把访问限制到列上 ) 
create or replace view v_emp_simple as
select ename, sal from emp where sal<2000
with check option;

select * from v_emp_simple;
update v_emp_simple set sal='99999' 
where ename='SMITH';
select * from emp;

create or replace view v_dept_emp_number as
select dname, nvl(total, 0) as total 
from dept t1 
left outer join
(select deptno, count(deptno) as total 
from emp group by deptno) t2
on t1.deptno=t2.deptno
with read only;

select * from v_dept_emp_number;
