import java.util.Scanner;

public class MenorIdade {
    public static void main(String[] args) {
        int[] idades = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        int menorIdade = idades[0];
        int menorIdadePosicao = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
                menorIdadePosicao = i;
            }
        }

        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("Posição(s):");

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == menorIdade) {
                System.out.println(i);
            }
        }
    }
}