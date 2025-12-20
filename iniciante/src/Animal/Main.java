package Animal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] aguia = {"vertebrado", "ave", "carnivoro"};
        String[] pomba = {"vertebrado", "ave", "onivoro"};
        String[] homem = {"vertebrado", "mamifero", "onivoro"};
        String[] vaca = {"vertebrado", "mamifero", "herbivoro"};
        String[] pulga = {"invertebrado", "inseto", "hematofago"};
        String[] lagarta = {"invertebrado", "inseto", "herbivoro"};
        String[] sanguessuga = {"invertebrado", "anelideo", "hematofago"};
        String[] minhoca = {"invertebrado", "anelideo", "onivoro"};
        Scanner sc = new Scanner(System.in);
        String caracteristica1 = sc.nextLine();
        String caracteristica2 = sc.nextLine();
        String caracteristica3 = sc.nextLine();
        String[] animal = {caracteristica1, caracteristica2, caracteristica3};
        if (Arrays.equals(animal, aguia)){
            System.out.println("aguia\n");
        } else if (Arrays.equals(animal, pomba)){
            System.out.println("pomba\n");
        } else if (Arrays.equals(animal, homem)){
            System.out.println("homem\n");
        } else if (Arrays.equals(animal, vaca)){
            System.out.println("vaca\n");
        } else if (Arrays.equals(animal, pulga)){
            System.out.println("pulga\n");
        } else if (Arrays.equals(animal, lagarta)){
            System.out.println("lagarta\n");
        } else if (Arrays.equals(animal, sanguessuga)){
            System.out.println("sanguessuga\n");
        } else if (Arrays.equals(animal, minhoca)){
            System.out.println("minhoca\n");
        }
        sc.close();
    }
}
