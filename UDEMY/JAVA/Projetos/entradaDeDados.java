import java.util.Scanner;

public class entradaDeDados {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Para digitar uma string
        /*String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);
        */

        //Para digitar um número inteiro
        /*int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);
        */

        //Para digitar um número com ponto flutuante
        /*double x;
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);
        */

        //Para digitar um caracter
        /*char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);*/
        
        //Para ler vários dados na mesma linha
        /*String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        */

        //Entrada de vários dados (é possível ler a string até a quebra de linha)
        /*String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        */

        //Inserindo uma quebra de linha pendente
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }

}
