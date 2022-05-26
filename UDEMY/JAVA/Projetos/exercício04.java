import java.util.Locale;
import java.util.Scanner;

public class exercício04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();
        
        System.out.println("Digite o número de horas trabalhadas pelo funcionário: ");
        int numeroHoras = sc.nextInt();
        
        System.out.println("Digite o valor da hora trabalhada do funcionário: ");
        double valorHora = sc.nextDouble();
        
        double salario = numeroHoras * ((double) valorHora);

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }
}
