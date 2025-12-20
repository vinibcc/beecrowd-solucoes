package SortSimples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] lista = {a, b, c};
        int[] lista_ordenada = {a, b, c};
        for (int i = 0; i < lista_ordenada.length; i++){
            for (int j = 0; j < lista_ordenada.length - 1; j++){
                if (lista_ordenada[j] > lista_ordenada[j + 1]){
                    int aux = lista_ordenada[j];
                    lista_ordenada[j] = lista_ordenada[j + 1];
                    lista_ordenada[j + 1] = aux;
                }
            }
        }
        for (int numero : lista_ordenada){
            System.out.println(numero);
        }
        System.out.println();
        for (int numero : lista){
            System.out.println(numero);
        }
        sc.close();
    }
}
