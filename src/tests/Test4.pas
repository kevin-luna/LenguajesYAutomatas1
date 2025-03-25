program Hello;
var
    c:integer;
    n:integer;
    sum,prom:real;
    calif: real;
begin
    read(n);
    c:=1;
    while c<=n do
    begin
        read(calif);
        sum := sum + calif;
    end;
    prom := sum/n;
    writeln('El promedio es',prom);
end.
