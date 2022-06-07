package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        aluno.name = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("Notal Final: %.2f%n", aluno.total());
        
        if(aluno.total() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("Pontos faltantes: %.2f PONTOS%n", aluno.pontosFaltantes());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();

    }
}
