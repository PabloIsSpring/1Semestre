package Aula_8;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        int linha = 0;
        int media = 0;
        int soma = 0;

        System.out.println("Digite 12 numeros parar formar uma matriz");

        for (int i = 0; i < 3; i++) {
            System.out.println("linha " + i);
            for (int j = 0; j < 4; j++) {
                System.out.println("Numero " + (j) + " da coluna");
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("# Imprimindo matriz #");

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + ", ");
            }
        }

        System.out.println("\nEscolha uma linha, que vai de 0 a 2, e irei calcular a media de todos os numeros da linha");
        linha = scan.nextInt();
        
        for(int i = linha; i == linha; i++){
            for(int j = 0; j < 4; j++){
                soma += matriz[linha][j];
            }
        }
        
        System.out.println("# Calculando media #");
        
        for(int i = linha; i == linha; i++){
            System.out.println("\n# Imprimindo linha #");
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[linha][j] +", ");
            }
        }
        
        media = soma / 4;
        
        System.out.println("\nA media dessa linha escolhida e: "+ media);
    }

}
