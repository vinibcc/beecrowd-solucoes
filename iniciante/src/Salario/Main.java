package Salario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        int horas = input.nextInt();
        double valorPorHora = input.nextDouble();
        double salario = valorPorHora * horas;
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", numero, salario);
        input.close();
    }
}
