import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do primeiro produto: ");
        double precoProduto1 = scanner.nextDouble();

        System.out.print("Digite o preço do segundo produto: ");
        double precoProduto2 = scanner.nextDouble();

        System.out.print("Digite o preço do terceiro produto: ");
        double precoProduto3 = scanner.nextDouble();

        double menorPreco;

        if (precoProduto1 <= precoProduto2 && precoProduto1 <= precoProduto3) {
            menorPreco = precoProduto1;
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (precoProduto2 <= precoProduto1 && precoProduto2 <= precoProduto3) {
            menorPreco = precoProduto2;
            System.out.println("Você deve comprar o segundo produto.");
        } else {
            menorPreco = precoProduto3;
            System.out.println("Você deve comprar o terceiro produto.");
        }

        System.out.println("Menor preço: " + menorPreco);

        scanner.close();
    }
}

