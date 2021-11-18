package playdados;

import java.util.Random;

public class Playdados {

    public static int dado(){
        
        Random random = new Random();
        int dado = random.nextInt(6)+1;
        
        return dado;   
    }
    
    public static void choose(){
        
        System.out.println("Vamos jogar os dados!");
    }
    
    public static void player_winner(){
        
        choose();
        
        int player_one_dado = dado();
        int player_one_dado2 = dado(); 
        int player_one_result = player_one_dado + player_one_dado2;
        
        int player_two_dado = dado();
        int player_two_dado2 = dado(); 
        int player_two_result = player_two_dado + player_two_dado2;
        
        if(player_one_result > player_two_result){
            System.out.println("Dado 1 do player 1 foi "+player_one_dado);
            System.out.println("Dado 2 do player 1 foi "+player_one_dado2);
            System.out.println("A soma dos dados foi "+player_one_result);
            System.out.println("Dado 1 do player 2 foi "+player_two_dado);
            System.out.println("Dado 2 do player 2 foi "+player_two_dado2);
            System.out.println("A soma dos dados foi "+player_two_result);
            System.out.println("Player 1 WIN!");
        }else if(player_one_result < player_two_result){
            System.out.println("Dado 1 do player 1 foi "+player_one_dado);
            System.out.println("Dado 2 do player 1 foi "+player_one_dado2);
            System.out.println("A soma dos dados foi "+player_one_result);
            System.out.println("Dado 1 do player 2 foi "+player_two_dado);
            System.out.println("Dado 2 do player 2 foi "+player_two_dado2);
            System.out.println("A soma dos dados foi "+player_two_result);
            System.out.println("Player 2 WIN!");
        }else{
            System.out.println("Dado 1 do player 1 foi "+player_one_dado);
            System.out.println("Dado 2 do player 1 foi "+player_one_dado2);
            System.out.println("A soma dos dados foi "+player_one_result);
            System.out.println("Dado 1 do player 2 foi "+player_two_dado);
            System.out.println("Dado 2 do player 2 foi "+player_two_dado2);
            System.out.println("A soma dos dados foi "+player_two_result);
            System.out.println("EMPATE!");
        } 
    }
    
    public static void main(String[] args) {
        player_winner();
    }  
}
