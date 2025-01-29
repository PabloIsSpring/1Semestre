package Aula_8;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[3][5];
        int[][] modMatriz = new int [3][5];
        
        System.out.println("Digite 15 numeros para formar uma matriz");
        
        for(int i = 0; i < 3; i++){
            System.out.println("Linha "+ i);
            for(int j = 0; j < 5; j++){
                System.out.println("coluna "+ j);
                matriz[i][j] = scan.nextInt();
                modMatriz[i][j] = matriz[i][j];
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                if(matriz[i][j] < 0){
                    modMatriz[i][j] = 0;
                }
            }
        }
        
        System.out.println("# Imprimindo matriz original ");
        
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j]+", ");
            }
        }
        
        System.out.println("\nImprimindo matriz sem numeros negativos");
        
        for(int i = 0; i < 3; i++){
            System.out.println("");
            for(int j = 0; j < 5; j++){
                System.out.print(modMatriz[i][j]+", ");
            }
        }
    }
    
}
