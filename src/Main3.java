import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os números ao usuário
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Verificar e exibir os números em ordem decrescente
        System.out.print("Ordem decrescente: ");
        if (numero1 > numero2) {
            System.out.println(numero1 + " " + numero2);
        } else {
            System.out.println(numero2 + " " + numero1);
        }

        scanner.close();
    }
}