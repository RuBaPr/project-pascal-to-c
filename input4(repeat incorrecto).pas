program ejemploRepeat;
var
  contador: INTEGER;

  contador := 0;
  repeat
    begin
      write('Contador: ', contador);
      contador := contador + 1;
    end
  until contador >= 5;
end.