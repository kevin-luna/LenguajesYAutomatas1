program Hello;
var
    nombre: string;
    flag: integer;
    ac: integer;
begin
    nombre := 'Kevin'+'Luna';
    ac:=0;
    while true do
    begin
        if ac=10 then break;
        writeln ('Hello World');
        ac := ac + 1 div 5;
    end;
end.
