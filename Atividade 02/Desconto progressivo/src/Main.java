import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desconto = 0;

        System.out.println("Insira o valor total da compra: ");
        double valorCompra = sc.nextDouble();

    if (valorCompra > 500) {
        desconto = valorCompra * 0.20;
    } else if (valorCompra >= 200 && valorCompra <= 500) {
        desconto = valorCompra * 0.10;
    } else if (valorCompra >= 100 && valorCompra < 200) {
        desconto = valorCompra * 0.05;
    }
    double valorLiquido = valorCompra - desconto;

        System.out.println("Valor bruto foi de: " + valorCompra);
        System.out.println("valor da compra foi de: " + valorLiquido);
        System.out.println("Valor do desconto foi de: " + desconto);

    }
}