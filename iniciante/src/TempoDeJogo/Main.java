package TempoDeJogo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        if (fim <= inicio){
            fim = fim + 24;
        }
        int tempo = fim - inicio;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);
        sc.close();
    }
}
