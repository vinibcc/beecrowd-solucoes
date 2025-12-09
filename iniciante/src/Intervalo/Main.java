package Intervalo;

import java.util.Scanner;

public class Main {

    public static String verificaIntervalo(double numero){
        if (numero > 25 && numero <= 50){
            return "Intervalo (25,50]";
        }
        else if (numero >= 0 && numero <= 25){
            return "Intervalo [0,25]";
        }
        else if (numero > 75 && numero <= 100){
            return "Intervalo (75,100]";
        }
        return "Fora de intervalo";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        System.out.println(verificaIntervalo(numero));
    }
}
