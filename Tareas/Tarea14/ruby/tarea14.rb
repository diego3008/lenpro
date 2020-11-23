print "Ingrese el numero de filas: "
filas = gets().to_i
print"Ingrese el numero de columnas: "
columnas = gets().to_i
contador = 0

if filas < 1 || columnas < 1
    print "Ingrese un numero de filas o columnas valido"
    exit
end

matriz = Array.new(filas){Array.new(columnas)}

for i in 0..filas - 1 do
    for j in 0..filas-1 do
        print "Ingrese un valor: "
        matriz[i][j] = gets().to_i
    end
end

print "Que numero desea buscar: "
numero = gets().to_i

for i in 0..filas - 1 do
    for j in 0..columnas - 1 do
        if numero == matriz[i][j]
            contador = contador + 1
        end
    end
end

print "El numero #{numero} aparece #{contador} veces en el arreglo \n"
puts "Arreglo: "

for i in 0..filas - 1 do
    for j in 0..columnas - 1 do
        print matriz[i][j]
    end
    print "\n"
end