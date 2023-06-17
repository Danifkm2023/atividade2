
    import java.util.ArrayList;
import java.util.List;

    public class ArraysLis {
        public static void main(String[] args) {
            // Criando uma lista de exemplo
            List<String> lista = new ArrayList<>();
            lista.add("Elemento 1");
            lista.add("Elemento 2");
            lista.add("Elemento 3");
            lista.add("Elemento 4");
            lista.add("Elemento 5");

            // Exibindo a lista antes da remoção
            System.out.println("Lista antes da remoção: " + lista);

            // Removendo o elemento específico da lista
            String elementoRemover = "Elemento 3";
            lista.remove(elementoRemover);

            // Exibindo a lista após a remoção
            System.out.println("Lista após a remoção: " + lista);
        }
    }

