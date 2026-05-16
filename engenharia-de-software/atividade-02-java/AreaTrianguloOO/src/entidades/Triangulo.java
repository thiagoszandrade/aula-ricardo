// No arquivo Triangulo.java
package entidades;

public class Triangulo {
    public double a;
    public double b;
    public double c;

    // Método para calcular a área do triângulo
    public double calcularArea() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
