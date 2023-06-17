import java.util.Scanner;

public class SomaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            numero += 5;
        } else {
            numero += 8;
        }

        System.out.println("O resultado da operação é: " + numero);
    }
}
