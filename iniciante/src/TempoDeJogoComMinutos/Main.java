package TempoDeJogoComMinutos;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int hora_inicial = sc.nextInt();
        int minuto_inicial = sc.nextInt();
        int hora_inicial_em_minutos = hora_inicial * 60 + minuto_inicial;

        int hora_final = sc.nextInt();
        int minuto_final = sc.nextInt();
        if (hora_final <= hora_inicial){
            if (minuto_final <= minuto_inicial){
                hora_final = hora_final + 24;
            }
        }

        int hora_final_em_minutos = hora_final * 60 + minuto_final;

        int tempo_em_minutos = hora_final_em_minutos - hora_inicial_em_minutos;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (tempo_em_minutos / 60), (tempo_em_minutos % 60));
    }
}
