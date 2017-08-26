-- 创建函数
create or replace function fn_get_avg_sal(dno number) 
return number is
  avgSal emp.sal%type;
begin
  select avg(sal) into avgSal from emp where deptno=dno;
  return avgSal;
end fn_get_avg_sal;

-- 调用函数获得其返回值
select fn_get_avg_sal(20) from dual;
