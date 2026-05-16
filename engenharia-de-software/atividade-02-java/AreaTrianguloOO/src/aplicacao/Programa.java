// Arquivo: Programa.java
package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo; // Importa a classe Triangulo

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo trianguloX, trianguloY, trianguloZ; // Declara as referências
        trianguloX = new Triangulo();     // Instancia o objeto trianguloX
        trianguloY = new Triangulo();     // Instancia o objeto trianguloY
        trianguloZ = new Triangulo();     // Instancia o objeto trianguloZ

        System.out.println("Digite as medidas do triângulo X:");
        trianguloX.a = sc.nextDouble();
        trianguloX.b = sc.nextDouble();
        trianguloX.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        trianguloY.a = sc.nextDouble();
        trianguloY.b = sc.nextDouble();
        trianguloY.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Z:");
        trianguloZ.a = sc.nextDouble();
        trianguloZ.b = sc.nextDouble();
        trianguloZ.c = sc.nextDouble();

        double p = (trianguloX.a + trianguloX.b + trianguloX.c) / 2.0;
        double areaX = Math.sqrt(p * (p - trianguloX.a) * (p - trianguloX.b) * (p - trianguloX.c));

        p = (trianguloY.a + trianguloY.b + trianguloY.c) / 2.0;
        double areaY = Math.sqrt(p * (p - trianguloY.a) * (p - trianguloY.b) * (p - trianguloY.c));

        p = (trianguloZ.a + trianguloZ.b + trianguloZ.c) / 2.0;
        double areaZ = Math.sqrt(p * (p - trianguloZ.a) * (p - trianguloZ.b) * (p - trianguloZ.c));

        

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        System.out.printf("Área do triângulo Z: %.4f%n", areaZ);

        if (areaX > areaY && areaX > areaZ) {
            System.out.println("Maior área: X");
        } else if (areaY > areaX && areaY > areaZ) {
            System.out.println("Maior área: Y");
        } else {
            System.out.println("Maior área: Z");
        }
        sc.close();
    }
}
