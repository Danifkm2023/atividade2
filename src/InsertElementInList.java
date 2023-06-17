import java.util.ArrayList;
import java.util.List;

public class InsertElementInList {
    public static void main(String[] args) {
        // Criando uma lista de exemplo
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");
        lista.add("Elemento 5");

        // Exibindo a lista antes da inserção
        System.out.println("Lista antes da inserção: " + lista);

        // Inserindo um elemento em uma posição específica da lista
        String elementoInserir = "Novo Elemento";
        int posicaoInserir = 2;
        lista.add(posicaoInserir, elementoInserir);

        // Exibindo a lista após a inserção
        System.out.println("Lista após a inserção: " + lista);
    }
}