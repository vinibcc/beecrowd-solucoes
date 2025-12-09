package ConversaoDeTempo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tempoSegundos = sc.nextInt();
        int tempoHoras = tempoSegundos / (60 * 60);
        tempoSegundos -= tempoHoras * (60 * 60);
        int tempoMinutos = tempoSegundos / 60;
        tempoSegundos -= tempoMinutos * 60;
        System.out.printf("%d:%d:%d\n", tempoHoras, tempoMinutos, tempoSegundos);
        sc.close();
    }
}
