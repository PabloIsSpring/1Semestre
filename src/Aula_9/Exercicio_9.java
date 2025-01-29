package Aula_9;

import java.util.Scanner;

public class Exercicio_9 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
     
        
        int[] megaSena = {54, 60, 41, 21, 10, 38};
        int[] aposta = new int[10];
        int numCerto = 0;
        
        
        
        System.out.println("Faca o sorteio de 10 numeros para apostar.");
        
        for(int i = 0; i < 10; i++){
            System.out.println("Numero"+(i + 1)+":");
            aposta[i] = scan.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 6; j++){
                if(aposta[i] == megaSena[j]){
                ++numCerto;
                }
            }
        }
        
        if(numCerto <= 3){
            System.out.println("Nao foi dessa vez, voce acertou so "+ numCerto +" numeros");
        } else if (numCerto == 4){
            System.out.println("Parebens!! voce acertou uma quadra!!");
        } else if (numCerto == 5){
            System.out.println("Parabens!! Voce acertou uma quina!!");
        } else {
            System.out.println("Parabens!! Voce foi o ganhador da Mega-Sena!!");
        }
 
    }
   
}
