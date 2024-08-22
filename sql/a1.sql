Declare 
	a number(3):=&a;
	b number(3):=&b;
	Begin
	dbms_output.put_line('Quotient of (a/b) is='||a/b);
	Exception When Value_Error Then
	dbms_output.put_line('Enter the correct numeric values');
	when Zero_Divide Then
	dbms_output.put_line('zero cannot be divided');
	End;
/
