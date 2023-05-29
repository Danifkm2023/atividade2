import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        // Obter o número do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (1-7): ");
        int numero = scanner.nextInt();

        // Verificar o número e exibir o dia correspondente
        String diaDaSemana;
        switch (numero) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda-feira";
                break;
            case 3:
                diaDaSemana = "Terça-feira";
                break;
            case 4:
                diaDaSemana = "Quarta-feira";
                break;
            case 5:
                diaDaSemana = "Quinta-feira";
                break;
            case 6:
                diaDaSemana = "Sexta-feira";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Valor inválido";
                break;
        }

        // Exibir o dia da semana correspondente
        System.out.println("Dia da semana: " + diaDaSemana);
    }
}

