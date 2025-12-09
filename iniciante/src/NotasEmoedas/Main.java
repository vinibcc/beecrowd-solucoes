package NotasEmoedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();
        int valorCentavos = (int)(valor * 100);
        int[] notas = new int[]{100, 50, 20, 10, 5, 2};
        double[] moedas = new double[]{1.0, 0.5, 0.25, 0.10, 0.05, 0.01};
        int quantidade;
        System.out.println("NOTAS:");
        for (int nota : notas){
            quantidade = (int)(valorCentavos / (nota * 100));
            valorCentavos -= (int)(quantidade * nota * 100);
            System.out.printf("%d nota(s) de R$ %.2f\n", quantidade, (float)nota);
        }
        System.out.println("MOEDAS:");
        for (double moeda : moedas){
            quantidade = (int)(valorCentavos / (moeda * 100));
            valorCentavos -= (int)(quantidade * moeda * 100);
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade, moeda);
        }
        sc.close();
    }
}
