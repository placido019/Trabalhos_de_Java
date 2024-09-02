import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir se seu número é par ou impar!");
        System.out.println("Digite seu número: ");
        Scanner escaneia = new Scanner(System.in);

        int numero = escaneia.nextInt();

        if(numero % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero impar!");
        }

    }
}