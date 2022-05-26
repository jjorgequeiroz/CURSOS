import java.util.Scanner; //importação da biblioteca Scanner 

public class exercicio01 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); //Comando necessário para poder utilizar entrada de dados
        
        //Declaração das variáveis
        int a = sc.nextInt();
        int b = sc.nextInt();

        int soma = a + b;

        //Saída do programa
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
