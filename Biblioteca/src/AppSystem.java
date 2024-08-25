import java.util.ArrayList;
import java.util.List;

public class AppSystem {
    private Biblioteca biblioteca;

    public AppSystem() {
        this.biblioteca = new Biblioteca();
    }

    public void run() {
        boolean running = true;

        while (running) {
            int opcao = IO.menu();
            if (opcao == 1) {
                cadastrarItem();
            } else if (opcao == 2) {
                listarItens();
            } else if (opcao == 3) {
                buscarItem();
            } else if (opcao == 4) {
                running = false;
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void cadastrarItem() {
        String tipo = IO.input("Digite 1 para Livro ou 2 para Periódico: ");

        String codigo = IO.input("Digite o código: ");
        String titulo = IO.input("Digite o título: ");
        int anoPublicacao = Integer.parseInt(IO.input("Digite o ano de publicação: "));

        if (tipo.equals("1")) {
            String autor = IO.input("Digite o autor: ");
            String isbn = IO.input("Digite o ISBN: ");
            Livro livro = new Livro(codigo, titulo, anoPublicacao, autor, isbn);

            if (livro.validarCampos()) {
                biblioteca.adicionarItem(livro);
                System.out.println("Livro cadastrado com sucesso.");
            } else {
                System.out.println("Erro ao cadastrar o livro. Verifique os campos.");
            }
        } else if (tipo.equals("2")) {
            String periodicidade = IO.input("Digite a periodicidade: ");
            int volume = Integer.parseInt(IO.input("Digite o volume: "));
            Periodico periodico = new Periodico(codigo, titulo, anoPublicacao, periodicidade, volume);

            if (periodico.validarCampos()) {
                biblioteca.adicionarItem(periodico);
                System.out.println("Periódico cadastrado com sucesso.");
            } else {
                System.out.println("Erro ao cadastrar o periódico. Verifique os campos.");
            }
        } else {
            System.out.println("Tipo inválido. Operação cancelada.");
        }
    }

    private void listarItens() {
        List<ItemBibliografico> itens = biblioteca.getItens();
        if (itens.isEmpty()) {
            System.out.println("Nenhum item cadastrado.");
        } else {
            for (ItemBibliografico item : itens) {
                System.out.println(item);
            }
        }
    }

    private void buscarItem() {
        String codigo = IO.input("Digite o código do item: ");
        ItemBibliografico item = biblioteca.buscarPorCodigo(codigo);
        if (item != null) {
            System.out.println("Item encontrado: " + item);
        } else {
            System.out.println("Item não encontrado.");
        }
    }
}
