package Aula_9;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int opcaoMenu = 0;
        double saldo = 0;
        double depositar = 0;
        double sacar = 0;
        
        System.out.println("Insira seu saldo:");
        saldo = scan.nextDouble();
        
        do{
            System.out.println("[1] - Deposito\n[2] - Saque\n[3] - Encerrar");
            opcaoMenu = scan.nextInt();
            
            switch(opcaoMenu){
                case 1:
                    System.out.println("Saldo: R$"+saldo);
                    System.out.println("Insira o valor para deposito:");
                    depositar = scan.nextDouble();
                    
                    saldo = deposito(saldo, depositar);
                    break;
                case 2:
                    System.out.println("Saldo: R$"+saldo);
                    System.out.println("Insira o valor que deseja sacar:");
                    sacar = scan.nextDouble();
                    
                    saldo = saque(saldo, sacar);
                    break;
                case 3:
                    if(saldo > 0){
                        System.out.println("Conta preferencial\nSaldo: R$"+saldo);
                    } else if (saldo < 0) {
                        System.out.println("Conta Estourada\nSaldo: R$"+saldo);
                    } else {
                        System.out.println("Conta zerada\nSaldo: R$"+saldo);
                    }
                    break;
                default:
                    System.out.println("OPCAO INVALIDA");
                    break;
            }
            
        }while(opcaoMenu != 3);
    }
    
    public static double deposito (double saldo, double deposito){
        double result = 0;
        
        result = saldo + deposito;
        
        return result;
    }
    
    public static double saque (double saldo, double saque){
        double result = 0;
        
        result = saldo - saque;
                
        return result;
    }
    
}
