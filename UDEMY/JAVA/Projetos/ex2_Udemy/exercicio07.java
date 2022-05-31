import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else {
            System.out.println("Q3");
        }

        sc.close();
    }
}
