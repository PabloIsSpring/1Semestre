//Pablo Emanuel RA:249388 Maélli Leme RA: 247591  Leonardo Toshiyuki RA: 247827
package Prova_AC2;

import java.util.Scanner;

public class ProjetoAC2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idItensCadastrados = new int[100];
        String[] nomeItem = new String[100];
        double[] valorItem = new double[100];
        int[] idProdutoCarrinho = new int[100];
        double[] valorProdutoCarrinho = new double[100];
        String[] nomeProdutoCarrinho = new String[100];
        double valorCompra = 0;
        int opcaoMenu = 0;
        int cont = 0;
        int contCarrinho = 0;
        String cadastrarMais = null;

        do {
            System.out.println("=====================================================\n"
                    + "Escolha uma opcao:\n"
                    + "1 - Cadastrar\n2 - Adicionar ao carrinho\n3 - Pagar\n0 - Encerrar Programa");
            opcaoMenu = scan.nextInt();

            switch (opcaoMenu) {
                case 1:
                    do {
                        idItensCadastrados[cont] = cont;

                        System.out.println("===========================\n"
                                + "Cadastre o Nome do produto");
                        nomeItem[cont] = scan.next();

                        System.out.println("===========================\n"
                                + "Cadastre o valor do item");
                        valorItem[cont] = scan.nextDouble();

                        System.out.println("===========================\n"
                                + "Deseja cadastrar mais?(Sim/Nao)");
                        cadastrarMais = scan.next().toLowerCase();
                        ++cont;
                    } while (cadastrarMais.equals("sim"));
                    break;
                case 2:
                    for (int i = 0; i < cont; i++) {
                        System.out.print("\n============================\n"
                                + "Produto: " + nomeItem[i] + " ID: " + idItensCadastrados[i]
                                + " Valor: " + valorItem[i]);
                    }
                    do {
                        System.out.println("\nDigite o ID do produto desejado:");
                        int idProduto = scan.nextInt();
                        
                        System.out.println("Qual a quantidade de produtos desse ID??");
                        double quant = scan.nextDouble();
                        
                        for(int i = 0; i < cont; i++){
                            if(idItensCadastrados[i] == idProduto){
                                idProdutoCarrinho[contCarrinho] = idProduto;
                                valorItem[i] = valorItem[i] * quant; 
                                valorProdutoCarrinho[contCarrinho] = valorItem[i];
                                nomeProdutoCarrinho[contCarrinho] = nomeItem[i];
                                valorCompra += valorItem[i];
                                contCarrinho++;
                            }
                        }

                        System.out.println("Deseja adicionar mais um produto no carrinho?(Sim/Nao)");
                        cadastrarMais = scan.next().toLowerCase();

                    } while (cadastrarMais.equals("sim"));

                    break;
                
                case 3:
                    System.out.println("Lista de produtos:");
                    for(int i = 0; i < contCarrinho; i++){
                        System.out.println(nomeProdutoCarrinho[i]+" "+idProdutoCarrinho[i]+" "+ valorProdutoCarrinho[i]);
                    }
                    System.out.println("Sua compra ficou em "+ valorCompra);
                    
            }
        } while (opcaoMenu != 0);

        }
    }

