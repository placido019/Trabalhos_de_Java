import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    System.out.println("Verificação de numero positivo ou negativo");

    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double numero = scan.nextDouble();

    if (numero == 0) {
        System.out.println("Numero natural (0)");
    } else if (numero > 0) {
        System.out.println("Numero positivo");
    } else if (numero < 0) {
        System.out.println("N");
    }

}

}