package Aula_7;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nmrs = new int[10];
        int[] impar = new int[10];
        int[] par = new int[10];
        int imparcont = 0;
        int parcont = 0;
        int processamento = 0;

        System.out.println("Digite 10 numeros que eu vou contar quais sao pares e quais sao impares");

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " valor:");
            nmrs[i] = scan.nextInt();
            
            processamento = nmrs[i] % 2;
            
            if(processamento == 0){
               par[parcont] = nmrs[i];
               ++parcont;
            }
            else {
                impar[imparcont] = nmrs[i];
                ++imparcont;
            }
        }
        
        System.out.println("Dentre esses numeros digitados:");
        for(int i = 0; i < 10; i++){
            System.out.print(nmrs[i]+"; ");
        }
        
        System.out.print("\nSao pares: ");
        for(int i = 0; i < parcont; i++){
            System.out.print(par[i]+"; ");   
        }
        
        System.out.print("\nSao impares: ");
        for(int i = 0; i < imparcont; i++){
            System.out.print(impar[i]+"; ");
        }
       
    }

}
