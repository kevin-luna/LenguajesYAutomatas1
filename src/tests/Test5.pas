program Hello;
const
    PI: real = 3.141592;
var
    i,j:integer;
    n,p:integer;
    sum,sum2,prom:real;
    calif: real;
begin
    read(n);
    read(p);
    i:=1;
    while i<=n do
    begin
        j:=1;
        wHile j<=p do
        begin
            read(calif);
            sum2 := sum2 + calif;
        end;
        sum := sum2
    end;
    prom := sum/n;
    writeln('El promedio es',prom);
end.
