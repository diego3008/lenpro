import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas, columnas,numero,buscar = 0;
        System.out.println("Cuantas filas quieres en tu matriz: ");
        filas = scanner.nextInt();
        System.out.println("Cuantas columnas quieres en tu matriz: ");
        columnas = scanner.nextInt();

        int matriz [][] = new int[filas][columnas];

        for (int i=0; i < filas; i++) {
            for (int j=0; j < columnas; j++) {
                System.out.println("Digite un valor para llenar la matriz: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Que valor desea buscar: ");
        numero = scanner.nextInt();
        for (int i=0; i < filas; i++) {
            for (int j=0; j < columnas; j++) {
                if (numero == matriz[i][j]) {
                    buscar++;
                }
            }
        }
        System.out.println("El numero " + numero + " aparece " + buscar + " veces");
        for (int i=0; i < filas; i++) {
            for (int j=0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
