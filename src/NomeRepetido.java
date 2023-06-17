import java.util.Scanner;

public class NomeRepetido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de repetições: ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println(nome);
        }
    }
}
