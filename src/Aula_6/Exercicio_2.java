package Aula_6;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int voto = 1;
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int cand4 = 0;
        int vBranco = 0;
        int vNulo = 0;
        
        System.out.println("Ola! essa e uma eleicao presidencial, vamos comecar a contagem de votos.");
        
        while(voto != 0){
            System.out.println("[1] - Candidato 1\n[2] - Candidato 2\n[3] - Candidato 3\n[4] - Candidato 4 "
                    + "\n[5] - Nulo\n[6] - Branco\n[0] - Encerrar votacao");
            voto = scan.nextInt();
            
            switch(voto){
                case 1:
                    ++cand1;
                    break;
                case 2:
                    ++cand2;
                    break;
                case 3:
                    ++cand3;
                    break;
                case 4:
                    ++cand4;
                    break;
                case 5:
                    ++vNulo;
                    break;
                case 6:
                    ++vBranco;
                    break;
                case 0:
                    System.out.println("# Votacao encerrada #");
                    break;
                default:
                    System.out.println("# Opcao invalida #");
                    break;
            }
        }
        System.out.println("O total de votos para cada candidato foi:\nCandidato 1: "+cand1+"\nCandidato 2: "
                +cand2+"\nCandidato 3: "+cand3+"\nCandidato 4: "+cand4+"\nVoto nulo: "+vNulo+"\nVoto Branco: "
                +vBranco);
    }

}
