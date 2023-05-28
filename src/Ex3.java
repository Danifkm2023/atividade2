import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = 10; // Quantidade de números a serem lidos
        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            // Verifica se o número é positivo
            if (numero > 0) {
                soma += numero;
            } else {
                System.out.println("Número inválido. Digite novamente.");
                i--; // Decrementa o contador para repetir a leitura
            }
        }

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close();
    }
}

