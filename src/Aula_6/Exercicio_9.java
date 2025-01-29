package Aula_6;

import java.util.Scanner;

public class Exercicio_9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade = 0;
        int mediaIdade = 0;
        int loop = 0;
        int respUsuario = 0;
        int maior90kg = 0;

        while (loop != 7) {
            System.out.println("Quantos anos voce tem?");
            respUsuario = scan.nextInt();
            idade += respUsuario;
            ++mediaIdade;

            System.out.println("E quantos quilos voce pesa?");
            respUsuario = scan.nextInt();
            
            if (respUsuario < 90){
                ++maior90kg;
            } 
            ++loop;
            
        }
        mediaIdade = idade / mediaIdade;
        
        System.out.println("A media das idade de todos voces e: "+ mediaIdade +
                 "\nE "+ maior90kg +" pessoas pesam mais de 90 quilos.");
    }

}
