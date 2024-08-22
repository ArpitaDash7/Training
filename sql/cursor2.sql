declare
cursor c is select * from employees;
begin
for c1 in c
loop
dbms_output.put_line(c1.employee_id||''||c1.first_name);
end loop;
end;
/