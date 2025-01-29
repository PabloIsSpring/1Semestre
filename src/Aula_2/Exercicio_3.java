package Aula_2;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("digite o valor da base do seu retangulo");
             float baseRetan = scan.nextFloat();
        System.out.println("agora digite o valor da altura do seu retangulo");
             float alturaRetan = scan.nextFloat();
             
                    float areaRetan = baseRetan * alturaRetan;
        
        System.out.println("a area do seu retangulo e "+ areaRetan);
    }
    
}
