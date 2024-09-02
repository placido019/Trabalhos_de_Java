import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bonificacao = 0;
        double imposto = 0;

        System.out.println("Insira o salário bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();

        System.out.println("Agora insira os anos trabalhados na empresa: ");
        int anosTrabalhados = sc.nextInt();

        if(anosTrabalhados > 10) {
            bonificacao = salarioBruto * 0.10;
        } else if (anosTrabalhados >= 5 && anosTrabalhados <= 10) {
            bonificacao = salarioBruto * 0.5;
        } else if (anosTrabalhados == 5) {
            System.out.println("Parece que você não tem tempo suficiente" +
                    " na empresa para ganhar bonficação!");
        }

        System.out.println("Vamos cálcular o imposto: ");

        if(salarioBruto > 5000) {
            imposto  = salarioBruto * 0.27;
        } else if (salarioBruto >= 3000 && salarioBruto < 5000){
            imposto = salarioBruto * 0.18;
        } else if (salarioBruto < 3000) {
            imposto = salarioBruto * 0.10;
        }
        double salarioLiquido = (salarioBruto - imposto) + bonificacao;

        System.out.println("Desconto no imposto foi de: " + imposto);
        System.out.println("A bonificação foi no valor de: " + bonificacao);
        System.out.println("Salário liquido com descontos e bonficação " +
                "foi de: " + salarioLiquido);


    }
}