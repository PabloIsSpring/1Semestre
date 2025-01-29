package Aula_8;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        int[] somaColunas = new int[5];
        int[] mediaColunas = new int[5];
        
        System.out.println("Digite 25 numeros para formar uma matriz");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Linha "+ i);
            for(int j = 0; j < 5; j++){
                System.out.println("Coluna "+ j);
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                somaColunas[i] += matriz[j][i];
            }
        }
        
        for(int i = 0; i < 5; i++){
            mediaColunas[i] = somaColunas[i] / 5;
            System.out.println(mediaColunas[i]);
        }
        
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] +", ");
            }
        }
        
        System.out.println("");
        
        for(int i = 0; i < 5; i++){
            System.out.println("Media da coluna "+ i +": "+ mediaColunas[i]);
        }
    }
    
}
