package Aula_6;

import java.util.Scanner;

public class Exercicio_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somaNegativo = 0;
        int cont1 = 0;
        int respUsuario = 1;

        System.out.println("Esse algoritmo so le numeros inteiro negativos,"
                + " numeros positivos sao ignorados.\n# (0 Encerra o programa) #");
        
        while(respUsuario != 0){
            System.out.println("Digite um valor:");
                respUsuario = scan.nextInt();
                
           if(respUsuario < 0){
               somaNegativo += respUsuario;
           }
        }
        
        System.out.println("A soma dos numeros inteiros negativos foi: "+ somaNegativo);
    }

}
