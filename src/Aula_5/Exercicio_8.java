package Aula_5;

public class Exercicio_8 {

    public static void main(String[] args) {
        
        int cont = 1;
        
        for(int i = 5; i >= 1; i--){
            System.out.println(" ");
            for(int j = 1; j <= i; j++){
                System.out.print(cont +" ");
                ++cont;
            }
        }
    }
    
}
