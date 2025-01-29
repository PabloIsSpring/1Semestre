package Aula_4;

public class Exercicio_14 {

    public static void main(String[] args) {
        
        long cont1 = 1; 
        long cont2 = 1;
        long cont3 = 0;
        
        System.out.println("veja a sequencia de fibonacci abaixo ate a centesima posicao");
        
        for(long i = 0; i < 100; i++){
            System.out.println(cont2);
            
            cont3 = cont2;
            cont2 = cont2 + cont3;
            cont1 = cont3;  
        }
    }
    
}
