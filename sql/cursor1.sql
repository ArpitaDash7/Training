create or replace trigger test_trigger
	after insert on test3
	Begin
	dbms_output.put_line('Trigger Fired');
	End;
/