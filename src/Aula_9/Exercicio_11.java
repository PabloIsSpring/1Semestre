package Aula_9;

import java.util.Scanner;

public class Exercicio_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        int vetor[] = new int[4];
        int soma = 0;

        System.out.println("Digite os numeros para a formacao de uma matriz:");

        for (int i = 0; i < 4; i++) {
            System.out.println("Fileira " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.println("Coluna " + (j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    soma += matriz[i][j];

                    vetor[i] = matriz[i][j];
                }
            }
        }

        System.out.println("Imprimindo matriz");

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "; ");

            }
        }
        System.out.println();
        System.out.println("Numeros da diagonal principal: ");
        
        for(int i = 0; i < 4; i++){
            System.out.print(vetor[i]+"; ");
        }
        
        
        System.out.println();
        System.out.println("E a soma desses numeros e :" + soma);

    }

}
