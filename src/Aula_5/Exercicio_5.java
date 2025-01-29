package Aula_5;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int vogais = 0;
        int consoante = 0;
        int espaco = 0;

        System.out.println("Digite alguma palavra, vou contar as consoantes e as vogais dela");
        String palavra = scan.nextLine().toLowerCase();
        
        for(int i = 0; i < palavra.length(); i++){
            char letras = palavra.charAt(i);
            
            switch(letras){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                     ++vogais;
                     break;
                case ' ':
                     ++espaco;
                     break;
                default:
                     ++consoante;
                     break;
            }
        }
        System.out.println("A quantidade de vogais na palavra sao: "+ vogais);
        System.out.println("A quantidade de consoantes na palavra sao: "+ consoante);
        
        
        
    }

}
