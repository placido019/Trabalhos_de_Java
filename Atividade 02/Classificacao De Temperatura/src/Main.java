import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sistema de classificação de temperatura");

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura: ");
        double temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Quente!");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("Agradavel");
        } else if (temperatura < 15) {
            System.out.println("Está frio");
        }

        System.out.println(temperatura);

    }
}