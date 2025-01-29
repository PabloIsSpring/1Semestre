/*Leia duas matrizes 4x4 e escreva uma terceira com os maiores elementos de cada posição*/
package Aula_9;

import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matriz1[][] = new int[4][4];
        int matriz2[][] = new int[4][4];

        System.out.println("Digite uma matriz 4x4");

        for (int i = 0; i < 4; i++) {
            System.out.println("Fileira " + (1 + i));
            for (int j = 0; j < 4; j++) {
                System.out.println("Coluna " + (j + 1));
                matriz1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Digite a Segunda agora");

        for (int i = 0; i < 4; i++) {
            System.out.println("Fileira " + (1 + i));
            for (int j = 0; j < 4; j++) {
                System.out.println("Coluna " + (j + 1));
                matriz2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz1[i][j] < matriz2[i][j]) {
                    matriz1[i][j] = matriz2[i][j];
                }
            }
        }

        System.out.println("Matriz com os maiores numeros de cada posição");

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz1[i][j] + ", ");
            }
        }
    }
}
