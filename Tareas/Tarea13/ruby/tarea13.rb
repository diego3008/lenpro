print "Ingresa el tamaño del arreglo "
tamano = gets().to_i
arreglo = Array.new(tamano)
bandera = 0

if tamano < 1
    print "Ingresa una cantidad valida para almacenar \n"
    exit
end

#Llenado de arreglo
for i in 1..tamano do
    print "Ingresa un numero"
    arreglo[i] = gets().to_i
end

print "Que numero deseas buscar?: "
numero = gets().to_i

for i in 1..tamano do
    if numero == arreglo[i]
        bandera = bandera + 1
    end
end
print "El numero #{numero} aparece #{bandera} veces en el arreglo \n"
print "Arreglo: \n"

for i in 1..tamano do
    puts arreglo[i]
end
