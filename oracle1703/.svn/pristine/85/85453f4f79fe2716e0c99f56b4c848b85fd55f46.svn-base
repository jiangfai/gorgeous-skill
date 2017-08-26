-- 查询月薪最高的员工姓名和工资
select ename, sal from emp 
where sal=(select max(sal) from emp);
-- 查询员工的年薪
select ename, (sal+nvl(comm, 0))*12 as annSal 
from emp order by annSal desc;

-- 查询入职超过 35 年的员工姓名和入职日期
select ename, to_char(hiredate, 'dd/mm/yy') as hiredate 
from emp where months_between(sysdate, hiredate) / 12 > 35;

-- dual 是伪表
select sysdate from dual;

-- 查询员工人数不少于 5 个人的部门的编号和人数
select deptno, count(deptno) as total from emp
group by deptno having count(deptno)>=5 
order by deptno;

-- 查询所有部门的名称和人数
select dname, nvl(total, 0) as total 
from dept t1 left outer join
(select deptno, count(deptno) as total from emp group by deptno) t2
on t1.deptno=t2.deptno;

select dname, nvl(total, 0) as total 
from dept t1,
(select deptno, count(deptno) as total from emp group by deptno) t2
where t1.deptno=t2.deptno(+);

-- 查询薪水超过其所在部门平均薪水的员工的姓名、部门编号和工资
select ename, t1.deptno, sal from emp t1 inner join (
select deptno, avg(sal) as avgSal from emp group by deptno) t2
on t1.deptno=t2.deptno and sal>avgSal;

-- 查询主管的姓名和职位
select ename, job from emp 
where empno in
(select distinct mgr from emp where mgr is not null);

-- exists / not exists

-- 查询薪资最高的 5 名员工的姓名和工资
-- 伪列
select rownum, t.* from
(select ename, sal from emp order by sal desc) t
where rownum<=5;

-- 查询薪资排在 6~10 名员工的姓名和工资
select ename, sal from
(select rownum as rn, t1.* from
(select ename, sal from emp order by sal desc) t1) t2
where rn between 6 and 10;































