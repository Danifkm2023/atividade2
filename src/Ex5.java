import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int valorInicial = scanner.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int valorFinal = scanner.nextInt();

        if (valorFinal <= valorInicial) {
            System.out.println("Intervalo de valores inválido.");
        } else {
            int soma = 0;
            for (int i = valorInicial; i <= valorFinal; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
            System.out.println("A soma dos números ímpares no intervalo é: " + soma);
        }

        scanner.close();
    }
}

