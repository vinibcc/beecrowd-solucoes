package Media3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = (int)(sc.nextDouble() * 100);
        int n2 = (int)(sc.nextDouble() * 100);
        int n3 = (int)(sc.nextDouble() * 100);
        int n4 = (int)(sc.nextDouble() * 100);
        int media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
        double mediaFormatada = (double) media / 100;

        System.out.printf("Media: %.1f\n", mediaFormatada);

        if (mediaFormatada >= 7){
            System.out.println("Aluno aprovado.");
        }
        else if (mediaFormatada < 5){
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Aluno em exame.");
            int notaExame = (int)(sc.nextDouble() * 100);
            System.out.printf("Nota do exame: %.1f\n", (double)notaExame / 100);
            media = (media + notaExame) / 2;
            mediaFormatada = (double) media / 100;
            if (mediaFormatada >= 5){
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFormatada);
        }
    }
}
