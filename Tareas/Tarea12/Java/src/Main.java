import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.printf("Digite el numero de elementos de la serie que desea imprimir: ");
        n = scanner.nextInt();
        serie(n);
    }
    public static void serie(int n) {
        int i, j, f = 0, k, x = 2, y = -3;
        int cont_1 = 0;
        for (i=2; i<=n+1; i++) {
            if (cont_1 == n)
                break;

            if (i%2 == 0) {
                f++;
                for (j=1; j<=f; j++) {
                    System.out.println(x);
                    x += 2;
                    cont_1++;
                    if (cont_1 == n)
                        break;
                }
            } else {
                for (k=1; k<=3; k++) {
                    System.out.println(y);
                    y -= 2;
                    cont_1++;
                    if (cont_1 == n)
                        break;
                }
            }
        }
    }
}
