package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ladoXa, ladoXb, ladoXc, ladoYa, ladoYb, ladoYc;

        System.out.println("Digite as medidas do triângulo X:");
        ladoXa = sc.nextDouble();
        ladoXb = sc.nextDouble();
        ladoXc = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y:");
        ladoYa = sc.nextDouble();
        ladoYb = sc.nextDouble();
        ladoYc = sc.nextDouble();

        double p = (ladoXa + ladoXb + ladoXc) / 2.0;
        double areaX = Math.sqrt(p * (p - ladoXa) * (p - ladoXb) * (p - ladoXc));

        p = (ladoYa + ladoYb + ladoYc) / 2.0;
        double areaY = Math.sqrt(p * (p - ladoYa) * (p - ladoYb) * (p - ladoYc));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }
        sc.close();
    }
}
