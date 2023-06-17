public class PreenchimentoVetor {
    public static void main(String[] args) {
        int[] vetor = new int[50];

        // Preenchimento automático do vetor com os números de 101 a 150
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 101 + i;
        }

        // Exibição dos valores do vetor
        System.out.println("Valores do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}