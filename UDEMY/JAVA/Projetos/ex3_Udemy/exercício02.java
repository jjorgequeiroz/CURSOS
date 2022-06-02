import java.util.Scanner;

public class exercício02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de x:");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y:");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");        
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
            System.out.println("Digite o valor de x:");
            x = sc.nextInt();
            System.out.println("Digite o valor de y:");
            y = sc.nextInt();
        }
        sc.close();
    }
}
