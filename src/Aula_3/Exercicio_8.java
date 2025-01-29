package Aula_3;

import java.util.Scanner;

public class Exercicio_8 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        
        System.out.println("e qual a forma de pagamento?");
            String fPagamento = scan.nextLine();
        
        System.out.println("qual foi o valor da sua compra?");
            double valorCompra = scan.nextDouble();
           
           
        double din = valorCompra - valorCompra * 0.05;
        double cartaoCredit = valorCompra * 1.10;
        double cartaoDebit = valorCompra;
        
        if (fPagamento.equals("dinheiro")){
        System.out.println("o valor da compra no dinheiro vai ficar "+ din);
        }
        
        if(fPagamento.equals("credito")){
        System.out.println("o valor da compra no credito vai ficar "+ cartaoCredit);
        }
             
        else if(fPagamento.equals("debito")){
        System.out.println("o valor da compra no debito vai ficar "+ cartaoDebit);   
        }
        
}}
