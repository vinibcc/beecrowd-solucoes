package IdadeEmDias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idadeEmDias = sc.nextInt();
        int anos = idadeEmDias / 365;
        idadeEmDias -= anos * 365;
        int meses = idadeEmDias / 30;
        idadeEmDias -= meses * 30;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", anos, meses, idadeEmDias);
        sc.close();
    }
}
