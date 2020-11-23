import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    int filas_1, columnas_1, filas_2, columnas_2;
        System.out.println("Ingresa el numero de filas de la matriz 1: ");
        filas_1 = scanner.nextInt();

        System.out.println("Ingresa el numero de columnas de la matriz 1: ");
        columnas_1 = scanner.nextInt();

        System.out.println("Ingresa el numero de filas de la matriz 2: ");
        filas_2 = scanner.nextInt();

        System.out.println("Ingresa el numero de columnas de la matriz 2: ");
        columnas_2 = scanner.nextInt();

        if (columnas_1 != filas_2) {
            System.out.println("Las columnas de la matriz 1 deben coincidir con las filas de la matriz 2.");
        } else {
            int matriz_1[][] = new int[filas_1][columnas_1];
            int matriz_2[][] = new int[filas_2][columnas_2];
            int matrizResultante[][] = new int[filas_1][columnas_2];

            //Llenado de matriz 1
            for (int i=0; i < filas_1; i++) {
                for (int j=0; j < columnas_1; j++) {
                    System.out.print("Matriz 1 - Posicion["+i+"]["+j+"] = ");
                    matriz_1[i][j] = scanner.nextInt();
                }
            }
            //Llenado de matriz 2
            for (int x=0; x < filas_2; x++) {
                for (int y=0; y < columnas_2; y++) {
                    System.out.print("Matriz 2 - Posicion["+x+"]["+y+"] = ");
                    matriz_2[x][y] = scanner.nextInt();
                }
            }
            //Multiplicación de matrices
            for (int i1=0;i1 < filas_1;i1++){
                for (int j2=0;j2 < columnas_2;j2++){
                    matrizResultante[i1][j2] = 0;
                    for (int k=0;k < columnas_1;k++){
                        matrizResultante[i1][j2] += matriz_1[i1][k] * matriz_2[k][j2];
                    }
                }
            }
            //Imprimiendo matriz 1
            for (int i=0; i < filas_1; i++) {
                for (int j=0; j < columnas_1; j++) {
                    System.out.print(matriz_1[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println(" ");
            //Imprimiendo la matriz 2
            for (int x=0; x < filas_2; x++) {
                for (int y=0; y < columnas_2; y++) {
                    System.out.print(matriz_2[x][y] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            //Imprimiendo la matriz resultante
            for (int i=0; i < filas_1; i++) {
                for (int j=0; j < columnas_2; j++) {
                    System.out.print(matrizResultante[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
