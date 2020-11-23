def celsiusFarenheit()
    print "Cuantos grados Celsius desea convertir: "
    celsius = gets().to_f
    gradosFarenheit = (celsius * 9/5) + 32
    print "#{gradosFarenheit.round(2)} grados farenheit \n"
end

def farenheitCelsius()
    print "Cuantos grados farenheit desea convertir "
    farenheit = gets().to_f
    gradosCelsius  = ((farenheit - 32) * 5) / 9
    print "#{gradosCelsius.round(2)} grados celsius \n"
end

begin
    
    puts "1.- ºC -> ºF "
    puts "2.- ºF -> ºC"

    print "Que opcion desea ejecutar: "
    opcion = gets().to_i
    puts opcion
    case opcion
    when 1
        celsiusFarenheit()
    when 2
        farenheitCelsius()
    else
        
    end
    
end while opcion == 1 || opcion == 2