import java.util.Scanner;

public class IO {

    public  static Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: \n");
        return new Scanner(System.in);
    }

    public static int menu(){
        System.out.println("-------------------------\n" +
                "1 - Cadastrar livro \n" +
                "2 - Listar livros \n" +
                "3 - Buscar livro por codigo" +
                "4 - Sair" +
                "-------------------------\n");
        return input("").nextInt();
    }
}
