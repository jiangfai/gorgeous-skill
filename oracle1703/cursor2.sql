declare
  cursor c is select ename, sal from emp;
  vEmp c%rowtype;
begin
  open c;
  loop
    fetch c into vEmp;
    exit when c%notfound;
    dbms_output.put_line(vEmp.ename||': '||vEmp.sal);
  end loop;
  close c;
end;
