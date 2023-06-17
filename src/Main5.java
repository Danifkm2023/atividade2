import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.print("O número na ordem inversa é: ");
        while (numero > 0) {
            int digito = numero % 10;
            System.out.print(digito);
            numero /= 10;
        }

        scanner.close();
    }
}
