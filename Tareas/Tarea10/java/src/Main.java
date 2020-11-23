import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero de elementos de la serie que quiere imprimir: ");
        n = scanner.nextInt();
        Serie(n);
        scanner.close();
    }

    public static void Serie(int x){
        int i;
        double num;
        for (i=1;i<=x;i++){
            num = Math.pow(i,((2*i)-1));
            long resultado = (long) num;
            System.out.println(resultado);
        }
    }

}

