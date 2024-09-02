import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner escaneia = new Scanner(System.in);

        System.out.println("Vamos fazer seu login!");
        System.out.println("Digite seu usuário: ");
        String usuario = escaneia.nextLine();

        System.out.println("Digite a sua senha: ");
        int senha = escaneia.nextInt();


        if(usuario.equals("joaolindo") && senha == 123) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos");
        }

    }
}
