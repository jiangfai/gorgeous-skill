declare
  cursor c is select ename, sal from emp;
  vEmp c%rowtype;
begin
  open c;
  fetch c into vEmp;
  while c%found loop
        dbms_output.put_line(vEmp.ename||': '||vEmp.sal);
        fetch c into vEmp;
  end loop;
  close c;
end;
