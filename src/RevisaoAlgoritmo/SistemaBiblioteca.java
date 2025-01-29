package RevisaoAlgoritmo;

import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] livros = {"A Metamorfose", "Meditacoes", "Carta Ao Pai", " ", " "};
        String[] autores = {"Franz Kafka", "Marco Aurelio", "Franz Kafka", " ", " "};
        String addLivro = null;
        int[] exemplares = {5, 0, 6, 0, 0};
        int menu = 0;
        int contLivros = 0;
        int idLivro = 0;
        int contManut = 0;

        do {
            System.out.println("\n# MENU #"
                    + "\n[1] - Catalogo de livros (Liste antes de cada operacao)"
                    + "\n[2] - Devolver livro"
                    + "\n[3] - Emprestimo de livro"
                    + "\n[4] - Adicionar novo livro"
                    + "\n[0] - Encerrar programa");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    contLivros = 0;

                    for (int i = 0; i < livros.length; i++) {
                        if (!livros[i].equals(" ")) {
                            contLivros++;
                            System.out.println("Codigo: " + contLivros + " " + livros[i] + "; Autor: " + autores[i]
                                    + "; " + exemplares[i] +" Exemplares Disponiveis");
                        }
                    }

                    break;
                case 2:
                    do {
                        System.out.println("Informe o codigo do livro que deseja devolver.");
                        idLivro = scan.nextInt();

                        if (idLivro <= contLivros) {
                            exemplares[idLivro - 1] = exemplares[idLivro - 1] + 1;
                        } else {
                            System.out.println("# CODIGO INVALIDO #");
                        }

                        System.out.println("Deseja devolver mais algum?");
                        addLivro = scan.next().toLowerCase();

                    } while (addLivro.equals("sim"));

                    break;
                case 3:
                    do {
                        System.out.println("Informe o código do livro que deseja pegar um exemplar.");
                        idLivro = scan.nextInt();

                        if (idLivro <= contLivros) {
                            if (exemplares[idLivro - 1] > 0) {
                                exemplares[idLivro - 1] = exemplares[idLivro - 1] - 1;
                            } else {
                                System.out.println("Esse livro nao possui exemplares.");
                            }
                        } else {
                            System.out.println("# Id de livro Invalido #");
                        }

                        System.out.println("Deseja pegar mais algum exemplar?");
                        addLivro = scan.next().toLowerCase();

                    } while (addLivro.equals("sim"));

                    break;
                case 4:
                    contManut = contLivros;
                    contLivros = livros.length - contLivros;
                    scan.nextLine();
                    
                    if (contManut != livros.length) {
                        System.out.println("E possivel adicionar " + contLivros + " novos livros no catalogo");
                        System.out.println("Digite o nome do novo livro");
                            
                        livros[contManut] = scan.nextLine();

                        System.out.println("Digite o autor desse livro");
                        autores[contManut] = scan.nextLine();

                        System.out.println("Digite quantos exemplares serao inseridos no sistema");
                        exemplares[contManut] = scan.nextInt();

                        contManut++;
                    } else {
                        System.out.println("O catalogo esta cheio, impossivel adicionar livros.");
                        break;
                    }
   
                    System.out.println("### LISTE O CATALOGO PARA ATUALIZAR O SISTEMA ###");

                    break;
                case 0:
                    System.out.println("! Encerrando Programa !");

                    break;
                default:
                    System.out.println("# OPCAO INVALIDA #");

                    break;
            }
        } while (menu != 0);
    }
}
