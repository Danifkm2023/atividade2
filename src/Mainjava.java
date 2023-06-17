import java.util.Scanner;

public class Mainjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadePessoas = 10;
        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturaHomens = 0;
        int quantidadeMulheres = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.println("Pessoa " + i);

            System.out.print("Digite a altura em centímetros: ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            if (sexo == 'M' || sexo == 'm') {
                somaAlturaHomens += altura;
            } else if (sexo == 'F' || sexo == 'f') {
                quantidadeMulheres++;
            }

            System.out.println();
        }

        double mediaAlturaHomens = somaAlturaHomens / quantidadePessoas;

        System.out.println("Maior altura: " + maiorAltura + " cm");
        System.out.println("Menor altura: " + menorAltura + " cm");
        System.out.println("Média de altura dos homens: " + mediaAlturaHomens + " cm");
        System.out.println("Número de mulheres: " + quantidadeMulheres);

        scanner.close();
    }
}
