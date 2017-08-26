-- ��ѯ��н��ߵ�Ա�������͹���
select ename, sal from emp 
where sal=(select max(sal) from emp);
-- ��ѯԱ������н
select ename, (sal+nvl(comm, 0))*12 as annSal 
from emp order by annSal desc;

-- ��ѯ��ְ���� 35 ���Ա����������ְ����
select ename, to_char(hiredate, 'dd/mm/yy') as hiredate 
from emp where months_between(sysdate, hiredate) / 12 > 35;

-- dual ��α��
select sysdate from dual;

-- ��ѯԱ������������ 5 ���˵Ĳ��ŵı�ź�����
select deptno, count(deptno) as total from emp
group by deptno having count(deptno)>=5 
order by deptno;

-- ��ѯ���в��ŵ����ƺ�����
select dname, nvl(total, 0) as total 
from dept t1 left outer join
(select deptno, count(deptno) as total from emp group by deptno) t2
on t1.deptno=t2.deptno;

select dname, nvl(total, 0) as total 
from dept t1,
(select deptno, count(deptno) as total from emp group by deptno) t2
where t1.deptno=t2.deptno(+);

-- ��ѯнˮ���������ڲ���ƽ��нˮ��Ա�������������ű�ź͹���
select ename, t1.deptno, sal from emp t1 inner join (
select deptno, avg(sal) as avgSal from emp group by deptno) t2
on t1.deptno=t2.deptno and sal>avgSal;

-- ��ѯ���ܵ�������ְλ
select ename, job from emp 
where empno in
(select distinct mgr from emp where mgr is not null);

-- exists / not exists

-- ��ѯн����ߵ� 5 ��Ա���������͹���
-- α��
select rownum, t.* from
(select ename, sal from emp order by sal desc) t
where rownum<=5;

-- ��ѯн������ 6~10 ��Ա���������͹���
select ename, sal from
(select rownum as rn, t1.* from
(select ename, sal from emp order by sal desc) t1) t2
where rn between 6 and 10;































