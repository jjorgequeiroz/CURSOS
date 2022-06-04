import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int N = sc.nextInt();
                
        for(int i = 0; i < N; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            double mediaPonderada = (a*2 + b*3 + c*5) / 10;
            System.out.printf("%.1f%n", mediaPonderada);
        }

        sc.close();
    }
}