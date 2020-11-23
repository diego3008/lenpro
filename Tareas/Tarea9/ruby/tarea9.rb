def dollar()
    print "Cuantos pesos deseas convertir a dolares: "
    pesos = gets().to_f
    dolares = pesos / 23.67
    print "#{pesos} pesos equivale a #{dolares.round(2)} dolares \n"
end

def euro()
    print "Cuantos pesos deseas convertir a euros: "
    pesos2 = gets().to_f
    euros = pesos2 / 25.97
    print "#{pesos2} pesos equivale a #{euros.round(2)} euros \n"
end

def yen()
    print "Cuantos pesos deseas convertir a yen: "
    pesos3 = gets().to_f
    yen = pesos3 / 0.22
    print "#{pesos3} pesos equivale a #{yen.round(2)} yen \n"
end

def dollarHK()
    print "Cuantos pesos deseas convertir a DHK: "
    pesos4 = gets().to_f
    dhk = pesos4 / 3.05
    print "#{pesos4} pesos equivale a #{dhk.round(2)} dolares de hong kong \n"
end

begin
    
    puts "1.- Peso a Dolares "
    puts "2.- Peso a Euro"
    puts "3.- Peso a Yen"
    puts "4.- Peso a Dolar HK"

    print "Que opcion desea ejecutar: "
    opcion = gets().to_i
    case opcion
    when 1
        dollar()
    when 2
        euro()
    when 3
        yen()
    when 4
        dollarHK()
    else
        
    end
    
end while opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4
