package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();

        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        funcionario.imposto = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionario: " + funcionario);
        System.out.println();

        System.out.print("Qual o percentual de incremento de salário: ");
        double porcentagem = sc.nextDouble();
        funcionario.incrementoSalario(porcentagem);

        System.out.println();
        System.out.println("Informações atualizadas: " + funcionario);

        sc.close();
    }
}
