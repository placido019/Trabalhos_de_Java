import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       System.out.println("Insira a sua média final");
       Scanner sc = new Scanner(System.in);

       double media = sc.nextDouble();

       if (media >= 7 && media < 11 ) {
           System.out.println("Aprovado");
       } else if (media >= 5 &&  media < 7) {
           System.out.println("Em recuperação");
       } else if (media < 5 && media >= 1) {
           System.out.println("Reprovou");
       } else {
           System.out.println("Valor inválido, tente novamente");
       }



    }
}