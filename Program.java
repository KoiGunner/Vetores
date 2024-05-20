package VectorsAndMatrix;

import java.util.Locale;
import java.util.Scanner;

/*

Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números
inteiros e armazene-os em um vetor. Em seguida,
mostrar na tela todos os números negativos lidos.

*/


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int a=0; a<vect.length; a++){
            System.out.print("Digite um número: ");
            vect [a] = sc.nextInt();
        }
        System.out.println("---------------------");
        for (int a=0; a<vect.length; a++){
            if(vect[a] <0){
                System.out.println("Número negativo:" + vect[a]);
            }
        }

        int count = 0;
        for (int a=0; a<vect.length; a++){
            if(vect[a] < 0){
                count++;
            }
        }

        System.out.print("Numeros negativos contidos são: " + count);
    }
}
