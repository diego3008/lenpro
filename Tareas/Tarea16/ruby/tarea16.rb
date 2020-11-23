print "Ingrese el numero de filas de la matriz 1: "
filas1 = gets().to_i
print"Ingrese el numero de columnas de la matriz 1: "
columnas1 = gets().to_i
print "Ingrese el numero de filas de la matriz 2: "
filas2 = gets().to_i
print "Ingrese el numero de columnas de la matriz 2: "
columnas2 = gets().to_i

if columnas1 != filas2
    print "Las columnas de la matriz 1 deben ser igual a las filas de la matriz 2 para realizar la multiplicacion"
    exit
end

matriz1 = Array.new(filas1){Array.new(columnas1)}
matriz2 = Array.new(filas2){Array.new(columnas2)}
matriz_resultante = Array.new(filas1){Array.new(columnas2)}

#Llenado de matriz 1
for i in 0..filas1 - 1 do
    for j in 0..columnas1 - 1 do
        print "Ingrese un numero[#{i}][#{j}] : "
        matriz1[i][j] = gets().to_i
    end
end

#Llenado de la matriz 2 
for i in 0..filas2 - 1 do
    for j in 0..columnas2 - 1 do
        print "Ingrese un numero[#{i}][#{j}]: "
        matriz2[i][j] = gets().to_i
    end
end

#Multiplicacion de matrices 
for i in 0..filas1 - 1 do
    for j in 0..columnas2 - 1 do
        matriz_resultante[i][j] = 0
        for f in 0..columnas1 - 1 do
            matriz_resultante[i][j] += matriz1[i][f] * matriz2[f][j]
        end
    end
end

#Imprimiendo matriz 1
puts "Matriz 1: "
for i in 0..filas1 - 1 do
    for j in 0..columnas1 - 1 do
        print "#{matriz1[i][j]}  "
    end
    print "\n"
end

print "\n"

#Imprimiendo la matriz 2
puts "Matriz 2: "
for i in 0..filas2 - 1 do
    for j in 0..columnas2 - 1 do
        print "#{matriz2[i][j]}  "
    end
    print "\n"
end

print "\n"

#Imprimiendo la matriz resultante 
puts "Matriz resultante: "
for i in 0..filas1 - 1 do
    for j in 0..columnas2 - 1 do
        print matriz_resultante[i][j]
    end
    print "\n"
end