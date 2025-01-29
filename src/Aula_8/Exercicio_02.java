package Aula_8;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int[][] matriz = new int[3][4];
        int soma = 0;
        
        System.out.println("Digite numeros e irei montar uma matriz e somar todos os numeros dentro dela.");
        
        for(int i = 0; i < 3; i++){
            System.out.println("Digite os numeros da fileira "+(i + 1));
            for(int j = 0; j < 4; j++){
                System.out.println("Matriz numero "+(j + 1)+":");
                matriz[i][j] = scan.nextInt();
                soma += matriz[i][j];
            }
        }
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j] +", ");
            }
        }
        
        System.out.print("\nO resultado da soma entre as matrizes e: "+ soma);
    }
    
}
