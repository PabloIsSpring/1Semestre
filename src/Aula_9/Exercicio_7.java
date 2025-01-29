package Aula_9;

import java.util.Scanner;

public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int nmrs[] = new int[10];
        int num = 0;
        int contaNumeros = 0;
        int cont = 0;
        
        System.out.println("Digite 10 numeros");
        
        for(int i = 0; i < 10; i++){
            System.out.println("Numero "+(i + 1)+":");
            nmrs[i] = scan.nextInt();
        }
        
        do{
            
            System.out.println("Digite algum numero e te falaremos se esse numero esta presente na lista");
            num = scan.nextInt();
            
            for(int i = 0; i < 10; i++){
                if(num == nmrs[i]){
                    contaNumeros = nmrs[i];
                    ++cont;
                }
            }
            
            if(cont != 0){
                System.out.println("O numero "+ contaNumeros +" esta na lista, esta presente "+ cont +" vezes");
                
            } else {
                System.out.println("Esse numero nao esta presente na lista, repita.");
            }
        }while(cont == 0);
        
        
    }
    
}
