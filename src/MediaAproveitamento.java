import java.util.Scanner;

public class MediaAproveitamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int numeroIdentificacao = scanner.nextInt();

        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        String conceito;
        if (mediaAproveitamento >= 90) {
            conceito = "A";
        } else if (mediaAproveitamento >= 75) {
            conceito = "B";
        } else if (mediaAproveitamento >= 60) {
            conceito = "C";
        } else if (mediaAproveitamento >= 40) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Número do aluno: " + numeroIdentificacao);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
