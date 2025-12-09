package AreaDoCirculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        double area = pi * (raio * raio);
        System.out.printf("A=%.4f\n", area);
        sc.close();
    }
}
