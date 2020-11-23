print "Cuantos elementos de la serie deseas imprimir: "
n = gets().to_i
contador = 0
f = 0
x = 2
y = -3

for i in 2..n + 1 do
    if contador == n
        break
    end
    if i%2 == 0
        f = f + 1
        for j in 1..f do
            puts x
            x = x + 2
            contador = contador + 1
            if contador == n
                break
            end
        end 
    end
    if i%2 != 0
        for k in 1..3 do
            puts y 
            y = y - 2
            contador = contador + 1
            if contador == n
                break
            end
        end
    end
end