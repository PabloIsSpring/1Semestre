package Aula_8;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[4][3];
        
        System.out.println("Digite 12 numeros e vamos montar uma matriz");
        for(int i = 0; i < 4; i++){
            System.out.println("Digite os numeros da fileira "+(i + 1));
            for(int j = 0; j < 3; j++){
                System.out.println("Numero "+(j + 1)+":");
                matriz [i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Imprimindo matriz:");
        
        for(int i = 0; i < 4; i++){
            System.out.println("");
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] +", ");
            }
        }
    }
    
}
