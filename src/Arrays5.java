import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a quantidade de funcionários: ");
            int quantidadeFuncionarios = scanner.nextInt();

            double somaSalarios = 0;

            for (int i = 1; i <= quantidadeFuncionarios; i++) {
                System.out.print("Digite o salário do funcionário " + i + ": ");
                double salario = scanner.nextDouble();
                somaSalarios += salario;
            }

            double mediaSalarial = somaSalarios / quantidadeFuncionarios;

            System.out.println("A média salarial da empresa é: " + mediaSalarial);

            scanner.close();
        }
    }

