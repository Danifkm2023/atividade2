public class MediaElementosImpares {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                soma += vetor[i];
                contador++;
            }
        }

        double media = (double) soma / contador;

        System.out.println("A média aritmética simples dos elementos ímpares é: " + media);
    }
}