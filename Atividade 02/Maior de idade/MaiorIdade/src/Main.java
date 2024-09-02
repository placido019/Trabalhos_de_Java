import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Digite a sua idade!");
        Scanner scan = new Scanner(System.in);

        int idade = scan.nextInt();

        if(idade < 18) {
            System.out.println("Menor de idade");
        } else if(idade >= 18) {
            System.out.println("Maior de idade");
        }
        System.out.println("Obrigado por usar o sistema de idade!");
    }
}