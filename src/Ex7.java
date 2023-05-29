import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números ímpares que deseja somar: ");
        int quantidade = scanner.nextInt();

        int soma = 0;
        int contador = 0;
        int numero = 1;

        while (contador < quantidade) {
            if (numero % 2 != 0) {
                soma += numero;
                contador++;
            }
            numero++;
        }

        System.out.println("A soma dos primeiros " + quantidade + " números ímpares é: " + soma);

        scanner.close();
    }
}

