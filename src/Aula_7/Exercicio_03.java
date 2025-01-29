package Aula_7;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int notas[] = new int[4];
        int totalNota = 0;
        
        for(int i = 0; i < 4; i++){
            System.out.println("Digite sua  nota "+ (i + 1) +": ");
            notas[i] = scan.nextInt();
            
            totalNota += notas[i];
        }
        
        int media = totalNota / 4;
        
        for(int i = 0; i < 4; i++){
            System.out.println("Sua "+ (i + 1) +" nota "+ notas[i]);
        }
        
        System.out.println("Teve como media: "+ media);
    }
    
}
