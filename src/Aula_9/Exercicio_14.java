/*Escreva um programa que leia uma matriz 4x5 de numeros inteiros e a exiba. Leia a seguir um numero e verifique
se esse numero lido esta ou nao na matriz. se estiver, escrever uma mensagem dizendo que o numero esta na matriz e em
quais posições da matriz ele se encontra*/
package Aula_9;

import java.util.Scanner;

public class Exercicio_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int matriz[][] = new int[4][5];
        int usuario = 0;
        
        System.out.println("Escreva uma matriz 4x5");
        
        for(int i = 0; i < 4; i++){
            System.out.println("Linha "+(i + 1));
            for(int j = 0; j < 5; j++){
                System.out.println("Coluna "+(j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }
        
        for(int i = 0; i < 4; i++){
            System.out.println("");
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
        
        System.out.println("Digite um numero agora");
        usuario = scan.nextInt();
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                if(matriz[i][j] == usuario){
                    System.out.println("Esse numero esta presente na matriz! nas respectivas posicoes"
                                      +"\nLinha: "+ (i + 1)
                                      +"\nColuna: "+(j + 1));
                }
            }
        }
        
        System.out.println("Esse numero nao esta presente na matriz.");
    }
    
}
