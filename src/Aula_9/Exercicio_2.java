package Aula_9;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double minutes = 0;
        double cont = 50;

        System.out.println("Olá, boa dia!! Você gastou quantos minutos no telefone esse mês?");
        minutes = scan.nextDouble();

        if(minutes >= 1 && minutes <= 3){
            minutes = minutes * 60;
        }

        if (minutes > 50){
            cont += contExtraHour(minutes);
            System.out.println("Sua conta ficou em: "+ cont +"$");
        } else {
            System.out.println("Sua conta ficou em 50$");
        }

    }
    public static double contExtraHour (double extraMinutes){

       double result = 0;

       extraMinutes = extraMinutes - 50;

       result = extraMinutes * 1.5;

       return result;
    }
    
}
    

