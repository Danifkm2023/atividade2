import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] argr){
       calcularMedia();

    }

    public static void calcularMedia(){

        System.out.println("Vamos somar sua média!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade notas:");
        double n = scanner.nextInt();
        double soma = 0;
        int contador = 0;
        while (contador < n){
            System.out.println("Digite a nota" + (contador+1)+":");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;

        }

        double media =(double)soma / n;
        System.out.println("A média é: " + media);
    }
}



