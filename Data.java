package VectorsAndMatrix;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Data {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //colocando o vetor em um determinado tamanho


        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        //armazenando os dados

        for (int a=0; a<n; a++){
            System.out.println("Digite um número");
            vect [a] = sc.nextDouble();
        }
        for (int a=0; a<n; a++){
            System.out.println("Valores = " + vect[a]);
        }

        double sum = 0.0;
        for (int a=0; a<n; a++){
            sum += vect[a];
        }

        System.out.println("Soma: " + sum);

        double media = sum;

        sc.close();
    }
}
