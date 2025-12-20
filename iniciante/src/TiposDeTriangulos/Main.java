package TiposDeTriangulos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (b > a && b > c){
            double aux = a;
            a = b;
            b = aux;
        }
        else if (c > a && c > b){
            double aux = a;
            a = c;
            c = aux;
        }

        if (a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
            if ((a * a) == (b * b) + (c * c)){
                System.out.println("TRIANGULO RETANGULO");
            }
            if (a * a > (b * b + c * c)){
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < (b * b) + (c * c)){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (
                (a == b && b != c) |
                (a == c && c != b) |
                (b == c && c != a)
            ){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        sc.close();
    }
}