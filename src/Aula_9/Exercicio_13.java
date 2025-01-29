/*Leia uma matriz de ordem 3 de numeros inteiros, imprima ela. Na sequencia calcule e mostre:
soma dos elementos pares da matriz
media de todos os elementos da matriz
quantidade de numeros impares da matriz*/
package Aula_9;

import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int matriz[][] = new int[3][3];
        int somaPares = 0;
        int mediaGeral = 0;
        int quantImpares = 0;
        
        System.out.println("Monte uma matriz de numeros inteiros");
        
        for(int i = 0; i < 3; i++){
            System.out.println("Fileira "+(i + 1));
            for(int j = 0; j < 3; j++){
                System.out.println("Coluna "+(j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < 3; i++){
            System.out.println();
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j]%2 == 0){
                    somaPares += matriz[i][j];
                }
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                mediaGeral += matriz[i][j];
            }
        }
        
        mediaGeral = mediaGeral / 9;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(matriz[i][j]%2 == 1){
                    ++quantImpares;
                }
            }
        }
        
        System.out.println("A soma de todos os elementos pares da matriz e: "+somaPares);
        System.out.println("A media geral de todos os elementos da matriz e: "+mediaGeral);
        System.out.println("A quantidade de numeros impares na matriz e: "+quantImpares);
    }
    
}
