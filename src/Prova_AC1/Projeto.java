package Prova_AC1;

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
        //código autoral de Pablo Emanuel e Leonardo Toshiyuki
        Scanner scan = new Scanner(System.in);
        
        //Valores dos lanches
        int vXBurguer = 15;
        int vXSalada = 18;
        int vXBacon = 20;
        int vXChurrasco = 25;
        int vHotDog = 12;
        
        //a varivel cont vai guardar a quantidade de lanches e o tipo de lanche
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        System.out.println("Ola, bem vindo ao carrinho de lanche da FACENS");
        System.out.println("Possuimos 5 opcoes, o cardapio e esse:");
        System.out.println("1- X-Burguer R$15");
        System.out.println("2- X-Salada R$18");
        System.out.println("3- X-Bacon R$20");
        System.out.println("4- X-Churrasco R$25");
        System.out.println("5- Hot-Dog R$12");
        System.out.println("Qual a quantidade de lanches que deseja?");
             int qLanches = scan.nextInt();

        System.out.println("Digite o numero do pedido no cardapio:");
        //nessa sout, e pra digitar o numero condizente ao lanche na tabela
        for (int i = 0; i < qLanches; i++) {

            System.out.println("Lanche " + (i + 1) + ":");
            int lanche = scan.nextInt();

            if (1 == lanche) {
                ++cont1;
            } else if (lanche == 2) {
                ++cont2;
            } else if (lanche == 3) {
                ++cont3;
            } else if (lanche == 4) {
                ++cont4;
            } else if (lanche == 5) {
                ++cont5;
            }
        }
        //aqui é o processamento de dados para o calculo da conta dos lanches
        int vValorC1 = vXBurguer * cont1;
        int vValorC2 = vXSalada * cont2;
        int vValorC3 = vXBacon * cont3;
        int vValorC4 = vXChurrasco * cont4;
        int vValorC5 = vHotDog * cont5;
        
        int valorTotal = vValorC1 + vValorC2 + vValorC3 + vValorC4 + vValorC5;
        
        System.out.println("O valor do seu pedido ficou em R$"+ valorTotal);
             

        
    }
}
