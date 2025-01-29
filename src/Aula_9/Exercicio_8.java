package Aula_9;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        double matriz[][] = new double [3][4];
        
        System.out.println("Digite uma matriz de 12 numeros");
        
        for(int i = 0; i < 3; i++){
            System.out.println("Fileira "+(i + 1)+":");
            for(int j = 0; j < 4; j++){
                System.out.println("Coluna "+(j + 1));
                matriz[i][j] = scan.nextDouble();
            }
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 4; j++){
                if(matriz[i][j] %2 == 0){
                    matriz[i][j] = matriz[i][j] / 2;
                    System.out.print(matriz[i][j] +", ");
                } else {
                    matriz[i][j] = matriz[i][j] / 3;
                    System.out.print(matriz[i][j] +", ");
                }
            }
        }
    }
}
