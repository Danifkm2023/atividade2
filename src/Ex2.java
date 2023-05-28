import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidade = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / quantidade;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }

}
