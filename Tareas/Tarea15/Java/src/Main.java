import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas_1, columnas_1, filas_2, columnas_2;
        int i,j;
        System.out.printf("Digite el numero de filas de la matriz 1: ");
        filas_1 = scanner.nextInt();
        System.out.printf("Digite el numero de columnas de la matriz 1: ");
        columnas_1 = scanner.nextInt();
        System.out.printf("Digite el numero de filas de la matriz 2: ");
        filas_2 = scanner.nextInt();
        System.out.printf("Digite el numero de columnas de la matriz 2: ");
        columnas_2 = scanner.nextInt();
        if (filas_1 != filas_2 || columnas_1 != columnas_2) {
            System.out.printf("Introduce un orden igual para ambas matrices");
        } else {
            int matriz_1[][] = new int[filas_1][columnas_1];
            int matriz_2[][] = new int [filas_2][columnas_2];
            int matrizResultante[][] = new int[filas_1][columnas_2];

            //Llenado de la matriz 1
            for (i=0; i < filas_1; i++) {
                for (j=0; j < columnas_1; j++) {
                    System.out.println("Digite un numero: ");
                    matriz_1[i][j] = scanner.nextInt();
                }
            }
            //Llenado de matriz 2
            for (i=0; i < filas_2; i++) {
                for (j=0; j < columnas_2; j++) {
                    System.out.println("Digite un numero: ");
                    matriz_2[i][j] = scanner.nextInt();
                }
            }
            //Imprimiendo matriz 1
            for (i=0; i < filas_1; i++) {
                for (j=0; j < columnas_1; j++) {
                    System.out.print(matriz_1[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            //Imprimiendo la matriz 2
            for (i=0; i < filas_2; i++) {
                for (j=0; j < columnas_2; j++) {
                    System.out.print(matriz_2[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            // Sumando las matrices
            for (i=0; i < filas_1; i++) {
                for (j=0; j < columnas_2; j++) {
                    matrizResultante[i][j] = matriz_1[i][j] + matriz_2[i][j];
                }
            }
            //Imprimiendo la matriz resultante
            for (i=0; i < filas_1; i++) {
                for (j=0; j < columnas_2; j++) {
                    System.out.print(matrizResultante[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}