package GastoDeCombustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidadeMedia = sc.nextInt();
        int distancia = tempo * velocidadeMedia;
        float gastoMedio = 12;
        float gastoTotal = distancia / gastoMedio;
        System.out.printf("%.3f\n", gastoTotal);
        sc.close();
    }
}
