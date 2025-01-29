package Aula_1;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
        System.out.println("Qual o valor do produto que deseja comprar?");
            float valorProduto = scan.nextFloat();
            
        System.out.println("qual a porcentegem de desconto?");
            float porcenDesconto = scan.nextFloat();
                float valorDesconto = porcenDesconto / 100;
                float vFinalDesconto = valorProduto * valorDesconto;
                float produtoFinal = valorProduto - vFinalDesconto;
        
        System.out.println("o valor do desconto e de "+vFinalDesconto);
        System.out.println("e o valor do produto com desconto e de "+produtoFinal);
        
    }
    
}
