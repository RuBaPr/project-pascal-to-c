program ejemploCondiciones;
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
    end;
end.