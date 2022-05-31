import java.util.Locale;//Importação da biblioteca Locale para poder utilizar "." como separador
import java.util.Scanner;

public class exercício02 {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);//Utilizando como padrão separador "."

        double raio = sc.nextDouble();//Definição e armazenamento do valor digitado do raio na variavel raio
        double pi = 3.14159;
        double areaCirculo = pi * (Math.pow(raio,2)); //utilização da função matemática de potênciação - Math.pow(a,b)
        
        System.out.printf("A = %.4f", areaCirculo);//Recurso para poder concatenar na mesma linha a variavel com arredondamento de casas decimais. 

        sc.close();
    }

}
