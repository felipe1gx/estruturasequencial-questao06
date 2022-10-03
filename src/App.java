import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner console = new Scanner(System.in);
        Double raio, area;
        System.out.println("Informe o raio do círculo: ");
        raio = console.nextDouble();
        area = 3.14 * (raio * raio);
        System.out.println("A área do Círculo é de: " + area);
    }
}
