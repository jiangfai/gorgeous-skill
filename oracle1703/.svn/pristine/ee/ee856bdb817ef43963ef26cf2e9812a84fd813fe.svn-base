declare
  cursor c is select ename, sal from emp for update;
begin
  for vEmp in c loop
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
