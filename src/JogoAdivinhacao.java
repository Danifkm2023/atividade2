import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSorteado = random.nextInt(10) + 1; // Gera um número aleatório de 1 a 10
        int pontuacao = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario == numeroSorteado) {
            pontuacao = 10;
            System.out.println("Você acertou! Pontuação: " + pontuacao + " :)"); // Carinha feliz
        } else if (numeroUsuario == numeroSorteado - 1 || numeroUsuario == numeroSorteado + 1) {
            pontuacao = 5;
            System.out.println("Você está próximo! Pontuação: " + pontuacao + " :)"); // Carinha feliz
        } else {
            System.out.println("Você errou! Pontuação: " + pontuacao + " :("); // Carinha triste
        }
    }
}