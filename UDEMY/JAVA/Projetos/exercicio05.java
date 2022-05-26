import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codPeca1 = sc.nextInt();
        int quantidadePeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
               
        
        int codPeca2 = sc.nextInt();
        int quantidadePeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();
        
        double TOTAL = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;
                System.out.printf("VALOR A PAGAR: R$ %.2F", TOTAL);
        

        sc.close();
    }
}
