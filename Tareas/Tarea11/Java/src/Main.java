import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero de elementos que desea imprimir: ");
        int numero = scanner.nextInt();
        scanner.close();
        Serie(numero);
    }
    public static void Serie(int n) {
        int i, j;
        int x = 1;
        int cont_1 = 0;
        for (i=1; i<=n; i++) {
            if (cont_1 == n)
                break;
            if (i % 2 != 0) {
                System.out.println(i * -1);
                cont_1++;
            } else {
                x++;
                for (j=1; j<=x; j++) {
                    System.out.println(i);
                    cont_1++;
                    if (cont_1 == n)
                        break;
                }
            }
        }
    }
}

