create or replace procedure P1(x number)
as
begin
if mod(x,2)=0 then
dbms_output.put_line(x||'is even number');
else
dbms_output.put_line(x||'is even number');
end if;
end;
/