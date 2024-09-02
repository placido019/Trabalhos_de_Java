import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cadastro de dia da semana!");

        int diaDaSemana = 0;
        String dia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 para dia da semana: ");
        diaDaSemana = sc.nextInt();


        switch(diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
                case 2:
                    dia = "Segunda";
                    break;
                    case 3:
                        dia = "Terça";
                        break;
                        case 4:
                            dia = "Quarta";
                            break;
                            case 5:
                                dia = "Quinta";
                                break;
                                case 6:
                                      dia = "Sexta";
                                      break;
                                      case 7:
                                          dia = "Sabado";
                                          break;
            default:
                dia = "Dia inválido";
                break;
        }

        System.out.println("Hoje é dia: " + dia);


    }
}