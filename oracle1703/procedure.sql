-- 创建存储过程
create or replace procedure sp_get_avg_sal(
	dno in number,
	avgSal out number) is
begin
  select avg(sal) into avgSal from emp where deptno=dno;
end sp_get_avg_sal;

-- 调用存储过程
declare
    vAvgSal emp.sal%type;
begin
  sp_get_avg_sal(&n, vAvgSal);
  dbms_output.put_line(vAvgSal);
end;
/
