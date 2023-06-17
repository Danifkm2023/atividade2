import java.util.Scanner;

public class NumerosEntre0e100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 20;
        int contadorNumerosEntre0e100 = 0;

        for (int i = 1; i <= totalNumeros; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorNumerosEntre0e100++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contadorNumerosEntre0e100);
    }
}
