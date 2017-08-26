delete from dept where deptno=10;
update dept set deptno=11 where deptno=10;

select * from emp;

create or replace trigger tr_update_dept
after update on dept
for each row begin
 update emp set deptno=:new.deptno
 where deptno=:old.deptno; 
end;
/
