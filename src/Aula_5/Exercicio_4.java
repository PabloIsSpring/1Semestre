package Aula_5;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Bom dia, qual o numero do mes que deseja saber?");
        int numMes = scan.nextInt();
        
        switch(numMes){
            case 1:
                System.out.println("Bem vindo ao mes de janeiro!");
                break;
            case 2:
                System.out.println("Bem vindo ao mes de fevereiro!");
                break;
            case 3:
                System.out.println("Bem vindo ao mes de marco!");
                break;
            case 4:
                System.out.println("Bem vindo ao mes de abril!");
                break;
            case 5:
                System.out.println("Bem vindo ao mes de maio!");
                break;
            case 6:
                System.out.println("Bem vindo ao mes de junho!");
                break;
            case 7:
                System.out.println("Bem vindo ao mes de julho!");
                break;
            case 8:
                System.out.println("Bem vindo ao mes de agosto!");
                break;
            case 9:
                System.out.println("Bem vindo ao mes de setembro!");
                break;
            case 10:
                System.out.println("Bem vindo ao mes de outubro!");
                break;
            case 11:
                System.out.println("Bem vindo ao mes de novembro!");
                break;
            case 12:
                System.out.println("Bem vindo ao mes de dezembro!");
                break;
        }
    }
    
}
