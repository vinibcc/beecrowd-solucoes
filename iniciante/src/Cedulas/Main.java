package Cedulas;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Locale localeBrasil = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int[] divisores = new int[]{100, 50, 20, 10, 5, 2, 1};
        int quantidade;
        System.out.println(valor);
        for(int divisor : divisores){
            quantidade = valor / divisor;
            valor = valor - (quantidade * divisor);
            System.out.printf(localeBrasil, "%d nota(s) de R$ %.2f\n", quantidade, (float)divisor);
        }
        sc.close();
    }
}
