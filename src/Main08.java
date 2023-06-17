public class Main08 {
    public static void main(String[] args) {
        System.out.println("Números no intervalo 100-150 com soma dos dígitos par:");

        for (int i = 100; i <= 150; i++) {
            int numero = i;
            int somaDigitos = 0;

            while (numero > 0) {
                int digito = numero % 10;
                somaDigitos += digito;
                numero /= 10;
            }

            if (somaDigitos % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

