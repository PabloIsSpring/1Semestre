package Aula_7;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] nmrs = new int[5];
        int mult = 1;
        int soma = 0;
        
        System.out.println("Digite 5 numeros que eu vou mostrar a soma e a multiplicacao entre eles");
        
        for(int i = 0; i <= 4; i++){
            System.out.println("Digite o "+ (i + 1) +" numero:");
            nmrs[i] = scan.nextInt();
            
            mult *= nmrs[i];
            soma += nmrs[i];
        }
        
        System.out.println("O resultado da multiplicacao entre os numeros digitados e: "+ mult
        +"\nO resultado da soma entre os numeros digitados e: "+ soma +"\nE os numeros digitados foram: ");
        
        for(int i = 0; i <= 4; i++){
            System.out.print(nmrs[i] +"; ");
        }
    }
    
}
