package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a altura e a largura do retângulo: ");
        retangulo.largura = sc.nextDouble();
        retangulo.altura = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
                 
       
        sc.close();
    }
}
