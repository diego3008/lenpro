print "Ingrese el numero de filas de la matriz 1: "
filas1 = gets().to_i
print"Ingrese el numero de columnas de la matriz 1: "
columnas1 = gets().to_i
print "Ingrese el numero de filas de la matriz 2: "
filas2 = gets().to_i
print "Ingrese el numero de columnas de la matriz 2: "
columnas2 = gets().to_i

if (filas1 != filas2 || columnas1 != columnas2)
    print "Las matrices tienen que ser del mismo orden para realizar la suma"
    exit
end

matriz_1 = Array.new(filas1){Array.new(columnas1)}
matriz_2 = Array.new(filas2){Array.new(columnas2)}
matrizResultante = Array.new(filas1){Array.new(columnas2)}

#Llenado de matriz 1
for i in 0..filas1 - 1 do
    for j in 0..columnas1 - 1 do
        print "Ingrese un numero: "
        matriz_1[i][j] = gets().to_i
    end
end

#Llenado de la matriz 2 
for i in 0..filas2 - 1 do
    for j in 0..columnas2 - 1 do
        print "Ingrese un numero: "
        matriz_2[i][j] = gets().to_i
    end
end

#Suma de matrices 
for i in 0..filas2 - 1 do
    for j in 0..columnas2 - 1 do
        matrizResultante[i][j] = matriz_1[i][j] + matriz_2[i][j]
    end
end

#Imprimiendo matriz 1
for i in 0..filas1 - 1 do
    for j in 0..columnas1 - 1 do
        print matriz_1[i][j]
    end
    print "\n"
end

print "\n"

#Imprimiendo la matriz 2
for i in 0..filas2 - 1 do
    for j in 0..columnas2 - 1 do
        print matriz_2[i][j]
    end
    print "\n"
end

print "\n"

#Imprimiendo matriz resultante 
for i in 0..filas2 - 1 do
    for j in 0..columnas2 - 1 do
        print matrizResultante[i][j]
    end
    print "\n"
end