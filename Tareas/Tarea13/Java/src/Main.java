import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lugares,numero, buscar = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres almacenar?: ");
        lugares = scanner.nextInt();
        System.out.println("Que numero quieres buscar? ");
        numero = scanner.nextInt();

        int arreglo[] = new int[lugares];

        for (int i=0; i < lugares; i++) {
            System.out.println("Ingresa un valor: ");
            arreglo[i] = scanner.nextInt();
        }

        for (int i=0; i < lugares; i++) {
            if (numero == arreglo[i]) {
                buscar++;
            }
        }
        System.out.println("El numero " + numero + " Aparece " + buscar + " veces en el arreglo");
        //Imprimir arreglo
        System.out.println("Arreglo: ");
        for (int i=0; i < lugares; i++) {
            System.out.print(arreglo[i]);
        }
    }
}
