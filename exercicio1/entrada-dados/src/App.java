import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double x;

        System.out.println("Digite aqqui");
        x = scanner.nextDouble();
        

        System.out.println("Hello, World!" + x);

        scanner.close();
    }
}
