-- 输入员工姓名工资低于200的加200 高于3000的减100
declare
  vName emp.ename%type;
  vSal emp.sal%type;
begin
      vName := '&n';
      select sal into vSal from emp where ename=vName;
      if vSal < 2000 then
         update emp set sal=sal+200 where ename=vName;
      elsif vSal > 3000 then
         update emp set sal=sal-100 where ename=vName;
      end if;
      commit;
      select sal into vSal from emp where ename=vName;
      dbms_output.put_line(vName||': '||vSal);
end;
