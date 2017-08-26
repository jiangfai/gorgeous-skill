declare
  cursor c(dno emp.deptno%type) is 
         select ename, sal from emp where deptno=dno for update;
begin
  for vEmp in c(20) loop
    if vEmp.sal < 2000 then
      update emp set sal=sal*2 where current of c;
    elsif vEmp.sal > 4000 then
      update emp set sal=sal*1.2 where current of c;
    else 
      update emp set sal=sal*1.5 where current of c;
    end if;
  end loop;
  commit;
end;
