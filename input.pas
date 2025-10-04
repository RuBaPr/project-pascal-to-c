program Test3;

const
    PI = 3.14159;
    FACTOR = 2;

var
    a, b, c: INTEGER;
    r, area: REAL;

procedure ShowValues(x: INTEGER; y: INTEGER; z: INTEGER);
var
    d, e, f, g: INTEGER;
    r2, r3, r4, r5 : REAL;
begin
    writeln('First value: ', x);
    writeln('Second value: ', y);
end;

function Multiply(n1: INTEGER; n2: INTEGER): INTEGER;
var
    n2: INTEGER;
begin
    Multiply := n1 * n2;
end;

function CircleArea(radius: REAL): REAL;
begin
    CircleArea := PI * radius * radius;
end;

procedure PruebaIf;
var
  x, y: INTEGER;
begin
  x := 10;
  y := 20;
  if x > y then
    begin
      write('x es mayor que y');
    end
  else
    begin
      write('y es mayor o igual que x');
    end;
end;

function PruebaCond(x, y: INTEGER): INTEGER;
var
  a, b, c: INTEGER;
begin
  a := 10;
  b := 20;
  c := 30;
  if (a < b) and (b < c) then
    begin
      write('a < b < c');
    end
  else if not (a = b) then
    begin
      write('a no es igual a b');
    end
  else
    begin
      write('a no es igual a b');
    end;
end;

procedure PruebaWhile;
var
  counter: INTEGER;
begin
  counter := 0;
  while counter < 5 do
    begin
      write('counter: ', counter);
      counter := counter + 1;
    end;
end;

procedure PruebaRepeat;
var
  counter: INTEGER;
begin
  counter := 0;
  repeat
    begin
      write('counter: ', counter);
      counter := counter + 1;
    end
  until counter >= 5;
end;

procedure ejemploForTo;
var
  i: INTEGER;
begin
  for i := 1 to 5 do
    begin
      write('Iteración: ', i);
    end;
end;

procedure ejemploForDownto;
var
  i: INTEGER;
begin
  for i := 5 downto 1 do
    begin
      write('Iteración: ', i);
    end;
end;

begin
    a := 5;
    b := 10;
    c := Multiply(a, b);

    ShowValues(a, c);

    r := 7.5;
    area := CircleArea(r);
    
    x1 := +123.456;
	x2 := 123.456;
	x3 := +12E+5;
	x4 := -3e-10;
	x5 := +123e5;
	x6 := -45E12;
	x7 := 456E+2;
	x8 := 10e-3;
	x9 := 123e4;
	x10 := 6E9;
	x11 := +12.34e+5;
	x12 := -0.99E-2;
	x13 := -123.45e6;
	x14 := +0.01E9;
	x15 := 987.65e+4;
	x16 := 3.1415E-2;
	x17 := 123.456e7;
	x18 := 1.0E3;


    writeln('Radius: ', r);
    writeln('Area of circle: ', area);
    writeln('Constant factor: ', FACTOR);
end.
