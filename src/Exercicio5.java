import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        zerarFila();
    }

    public static void zerarFila(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho da fila: ");
        int tamanhoDaFila = scanner.nextInt();
        int[] fila = new int[tamanhoDaFila];

         while (fila.length > 0 ){
             System.out.println("Atendimento iniciado, aperte 0 para finalizar");
             int enter = scanner.nextInt();
             if(enter==0){
                 fila = removeDaFila(fila);
             }
         }

        System.out.println("fila zerada");
    }
    public static int[] removeDaFila(int[] arr) {
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr,1, result,0, arr.length - 1);
        return result;
    }
}



