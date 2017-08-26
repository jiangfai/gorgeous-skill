declare
  cursor c is select ename, sal from emp;
begin
  for vEmp in c loop
    dbms_output.put_line(vEmp.ename||': '||vEmp.sal);
  end loop;
end;
