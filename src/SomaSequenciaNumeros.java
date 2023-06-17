import java.util.Scanner;

public class SomaSequenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número (digite um número negativo para encerrar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números digitados é: " + soma);
    }
}