import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReajusteSalarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> salarios = new ArrayList<>();

        // Leitura dos salários
        System.out.println("Digite os salários (digite -1 para encerrar):");
        double salario = scanner.nextDouble();
        while (salario != -1) {
            salarios.add(salario);
            salario = scanner.nextDouble();
        }

        // Leitura do valor do reajuste
        System.out.print("Digite o valor do reajuste: ");
        double reajuste = scanner.nextDouble();

        // Aplicação do reajuste aos salários
        List<Double> salariosReajustados = new ArrayList<>();
        for (double s : salarios) {
            double salarioReajustado = s + (s * reajuste / 100);
            salariosReajustados.add(salarioReajustado);
        }

        // Exibição dos salários reajustados
        System.out.println("Salários reajustados:");
        for (double s : salariosReajustados) {
            System.out.println(s);
        }
    }
}
