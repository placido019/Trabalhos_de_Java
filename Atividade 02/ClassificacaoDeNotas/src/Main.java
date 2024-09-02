import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Vamos classificar suas notas!");
        int nota = 0;

        System.out.println("Digite a sua nota!");
        Scanner escaneia = new Scanner(System.in);
        nota = escaneia.nextInt();

        if(nota >= 9 ) {
            System.out.println("Nota excelente!");
        } else if (nota >= 7 ) {
            System.out.println("Nota boa!");
        } else if (nota >= 5 ) {
            System.out.println("Nota satisfatória");
        } else if (nota >= 5 ) {
            System.out.println("Nota insatisfatória!");
        }

        System.out.println("Obrigado por usar a classificação de notas!");


    }
}