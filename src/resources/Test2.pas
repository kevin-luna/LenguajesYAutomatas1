program Hello;
var
    flag: integer;
    ac: integer;
begin
    ac:=0;
    while true do
    begin
        if ac=10 then break;
        writeln ('Hello World');
        ac := ac + 1;
    end;
end.
