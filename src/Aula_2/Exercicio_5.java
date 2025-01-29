package Aula_2;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("Quantos pontos o lider do campeonato tem?");
            int pLiderCamp = scan.nextInt();
          
        System.out.println("E quantos pontos o lanterna tem?");
            int pLanternaCamp = scan.nextInt();
            
                int vitorias = (pLiderCamp - pLanternaCamp + 3) / 3;
        System.out.println("Serao necessarias "+vitorias+" vitorias para ultrapassar os pontos do lider.");
    }
    
}
