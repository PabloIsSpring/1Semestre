package Aula_4;

import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int valor = 1;
        int result = 0;
        int soma = 0;
        
        System.out.println("digite algum numero");
            int num = scan.nextInt();
            
        for(int i = 0; i < num; i++){
            soma = result;
            result = result + valor;
        }
        
        System.out.println(soma +" + "+ valor +" = "+ result);
    }
    
}
