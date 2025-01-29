package Aula_9;

import java.util.Scanner;

public class Exercicio_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        double hour = 0;
        double extraHour = 0;

        System.out.println("Quantas horas trabalhadas, sem contar extras, você fez esse mês?");
        hour = scan.nextDouble();

        System.out.println("Quantas horas extras trabalhadas?");
        extraHour = scan.nextDouble();

        System.out.println("");

        System.out.println("O seu salário esse mês é: "+hoursCont(hour, extraHour)+"R$");
    }

    public static double hoursCont (double hour, double extraHour){
        double salario = 0;
        double payHour = 10;
        double extraPayHour = 15;

        salario = payHour * hour;
        salario += extraPayHour + extraHour;


        return salario;
    }
}
    
