puts "Ingrese el numero de elementos que desea imprimir: "
n = gets().to_i

def serie(n)
    x = 1
    cont = 0
    for i in 1..n do
        if cont == n
            break
        end
        if i%2 != 0
            puts i * -1
            cont = cont + 1
        else
            x = x + 1
            for j in 1..x do
                puts i 
                cont = cont + 1
                if cont == n
                    break
                end
            end
        end
    end
end

serie(n)