puts "Ingrese el numero de elementos que desea imprimir: "
n = gets().to_i

for i in 1..n do
    puts i ** ((2*i) - 1)
end