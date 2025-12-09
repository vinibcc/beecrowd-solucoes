package Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] precos = {4.00, 4.50, 5.00, 2.00, 1.50};
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total = quantidade * precos[codigo - 1];
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
