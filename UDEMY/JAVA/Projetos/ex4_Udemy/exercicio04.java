import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();

        for (int i = 0 ; i < N ; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            
            if(b == 0) {
                System.out.println("divisao impossivel");
            } 
            else {
                double divisao = a / b;
                System.out.printf("%.1f%n", divisao);
            }
           
        }      

        sc.close();
    }

}
