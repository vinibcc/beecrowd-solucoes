package CalculoSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cod1 = input.nextInt();
        int qtd1 = input.nextInt();
        double preco1 = input.nextDouble();
        int cod2 = input.nextInt();
        int qtd2 = input.nextInt();
        double preco2 = input.nextDouble();
        double valorTotal = (qtd1 * preco1) + (qtd2 * preco2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
        input.close();
    }
}
