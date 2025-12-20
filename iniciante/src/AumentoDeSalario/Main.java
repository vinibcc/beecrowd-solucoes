package AumentoDeSalario;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float salario = sc.nextFloat();
        int percentualReajuste;

        if (0 <= salario && salario <= 400) {
            percentualReajuste = 15;
        } else if (400.01 <= salario && salario <= 800) {
            percentualReajuste = 12;
        } else if (800.01 <= salario && salario <= 1200) {
            percentualReajuste = 10;
        } else if (1200.01 <= salario && salario <= 2000) {
            percentualReajuste = 7;
        } else {
            percentualReajuste = 4;
        }

        float reajuste = salario * ((float) percentualReajuste / 100);
        float salarioReajustado = salario + reajuste;
        System.out.printf("Novo salario: %.2f\n", salarioReajustado);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentualReajuste);

        sc.close();
    }
}
