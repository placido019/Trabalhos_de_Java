import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int decisao = 0;
        int n1 = 0;
        int n2 = 0;
        int operacao = 0;

        System.out.println("Vamos ao sistema de calculadora");
        System.out.println("Digite 1 para divisão, 2 para multiplicação," +
                " 3 soma e 4 para subtração: ");

        decisao = sc.nextInt();

        if (decisao == 1) {
            System.out.println("Digite os números a serem divididos: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            operacao = n1 / n2;

        } else if (decisao == 2) {
            System.out.println("Digite os números a serem multiplicados: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        operacao = n1 * n2;

        } else if (decisao == 3) {
            System.out.println("Digite os números a serem somados: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            operacao = n1 + n2;

        } else if (decisao == 4) {
            System.out.println("Digite os números a serem subtraídos");
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            operacao = n1 - n2;

        } else {
            System.out.println("Número nao reconhecido, tente novamente!");
        }

        if (decisao == 1 || decisao <= 4 ) {
            System.out.println("Resultado: " + operacao);
        }

    }
}