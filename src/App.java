public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Forma f1 = new Quadrado("Quadrado");

        f1.ExibirNome();

        String x = "Bla";
        int y = 3;
        float d = 3.4f;
        double h = 5.8;
        System.out.println(x + y + d + h);
    }
}