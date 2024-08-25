
public class App {
    public static void main(String[] args) {

        try{
            AppSystem appSystem = new AppSystem();
            appSystem.run();
        } catch (Exception e) {
            System.out.println("Erro inesperado " +e.getMessage());
            e.printStackTrace();
        }
    }
}