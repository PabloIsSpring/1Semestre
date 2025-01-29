package Aula_8;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[5][3];
        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        System.out.println("Vou montar uma matriz com 15 numeros e apontar o maior dentre eles junto com sua posicao");

        for (int i = 0; i < 5; i++) {
            System.out.println("Linha " + (i));
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o numero " + (j) + " da coluna ");
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        
        System.out.println("O maior numero digitado foi "+ maior +", e ele se encontra na linha "+ linha +"\n"
                + "na coluna "+ coluna);
    }

}
