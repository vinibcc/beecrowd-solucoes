package Area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = pi * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf("""
                TRIANGULO: %.3f
                CIRCULO: %.3f
                TRAPEZIO: %.3f
                QUADRADO: %.3f
                RETANGULO: %.3f
                """, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        sc.close();
    }
}
