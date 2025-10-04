program ejemploWhile;
var
  contador: INTEGER;
begin
  contador := 0;
  while contador < 5 do
    begin
      write('Contador: ', contador);
      contador := contador + 1;
    end;
end.