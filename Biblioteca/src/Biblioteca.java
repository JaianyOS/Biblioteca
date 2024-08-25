import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public static void main(String[] args) {

        public class Biblioteca {
            private List<IntemBibliografico> itens;

            public Biblioteca() {
                this.itens = new ArrayList<>();
            }
            public void addIntem(IntemBibliografico intem) {
                if (!this.itens.contains(intem)) {}
                itens.add(intem);
                System.out.println("Item adicionado!");
            } else {
                System.out.println("Item nao adicionado!");
            }
        }

        public void listarItens(){
            if (itens.isEmpty()){
                System.out.println("Biblioteca vazia!");
            } else {
                for(ItemBibliografico item : itens) {
                    System.out.println("Código: " + item.getCodigo() + ", Título: " + item.getTitulo() + ", Ano: " + item.getAnoPublicacao());
            }
        }

        public IntemBibliografico buscarCodigo(String codigo) {
                for (ItemBibliografico item: itens) {
                    if (item.getCodigo().equals(codigo)){
                        return item;
                    }
                }
                System.out.println("Item nao encontrado!");
                return null;
            }

    }
}
