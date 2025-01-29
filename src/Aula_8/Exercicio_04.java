package Aula_8;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] dobroMatriz = new int [3][3];
        
        System.out.println("Digite numeros que irei montar uma matriz e mostrar o dobro dela");
        
        for(int i = 0;i < 3; i++){
            System.out.println("Linha "+ i);
            for(int j = 0; j < 3; ++j){
                System.out.println("o numero "+(i + 1)+" da matriz");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Matriz com o dobro dos numeros digitados: ");
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                dobroMatriz[i][j] = matriz[i][j] * 2;
                
                System.out.print(dobroMatriz[i][j]+", ");
            }
        }
        
        System.out.println("\nMatriz original");
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+", ");
            }
        }
    }

}
