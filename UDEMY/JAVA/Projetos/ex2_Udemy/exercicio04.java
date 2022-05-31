import java.util.Scanner;

public interface exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        
        int tempoDeJogo;

        if (inicio < fim) {
            tempoDeJogo = fim - inicio;

        } else {
            tempoDeJogo = 24 - inicio + fim;
        }

        System.out.println("O JOGO DUROU " + tempoDeJogo + " HORA(S)");

        sc.close();
    }
}
