package Distancia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        int minutos = distancia * 2;
        System.out.printf("%d minutos\n", minutos);
        sc.close();
    }
}
