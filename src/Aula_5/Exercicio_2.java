package Aula_5;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float desc1 = 0;
        float desc2 = 0;
        float desc3 = 0;
        
        System.out.println("Bom dia! Qual o valor da sua compra?");
             float vCompra = scan.nextFloat();
             
        if(vCompra >= 200){
            desc1 = vCompra * 0.80f;
            System.out.println("Com o desconto de 20%, sua compra ficou em "+ desc1 +"R$");
        }
        else if(vCompra >= 100 & vCompra < 200){
            desc2 = vCompra * 0.90f;
            System.out.println("Com o desconto de 10%, sua compra ficou em "+ desc2 +"R$");
        }
        else if(vCompra >= 50 & vCompra < 100){
            desc3 = vCompra * 0.95f;
            System.out.println("Com o desconto de 5%, sua compra ficou em "+ desc3 +"R$");
        }
        else{
            System.out.println("Voce nao ganhou nenhum desconto na nossa loja, sua compra ficou em "+ vCompra);
        }
             
        
            
        
    }
    
}
