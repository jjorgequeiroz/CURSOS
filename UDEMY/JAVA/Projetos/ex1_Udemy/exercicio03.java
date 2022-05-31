import java.util.Scanner;

public class exercicio03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, DIFERENCA;//Declaração das variáveis 
        
        //Cada variável receberá o valor digitado no console
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        //Fórmula da diferença solicitada
        DIFERENCA = (A * B - C * D);

        System.out.println(DIFERENCA); //saída do programa

        sc.close();
    }
}
