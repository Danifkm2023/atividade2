import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Obter o salário atual do colaborador
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário atual do colaborador: ");
        double salarioAtual = scanner.nextDouble();

        // Definir as variáveis para armazenar os valores do reajuste
        double percentualAumento = 0;
        double valorAumento = 0;

        // Calcular o reajuste de acordo com os critérios fornecidos
        if (salarioAtual <= 280.00) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        valorAumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        // Exibir os resultados na tela
        System.out.println("Salário antes do reajuste: R$" + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$" + valorAumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);
    }
}

