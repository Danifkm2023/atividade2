import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.println("Digite 5 números de sua preferência:");

      int soma = 0;

      for(int i = 0; i < 5; i++){

          int numero = scanner.nextInt();
          soma += numero;
      }


     System.out.println("Soma dos números digitados é:" + soma);

  }

}
