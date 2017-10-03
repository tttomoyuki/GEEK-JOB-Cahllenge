
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class BlackJack {
    
  
  
    
   
    
  
    
    
      
       
      
     
  
public static void main(String[] args){
    
     
         Dealer dealer = new Dealer();
     
    dealer.cards();
    
    dealer.deal();
    
    dealer.setCard(dealer.deal());
    
    System.out.println(dealer.chckSum());
    
    if(dealer.chckSum().equals("true")){
        System.out.println("hitします");
        dealer.hit();
        dealer.myCards.add(dealer.hit().get(0));
        System.out.println("dealerの手札をオープン");
        System.out.println(dealer.open());
    }else{
        System.out.println("hitしません");
        System.out.println("dealerの手札をオープン");
        System.out.println(dealer.open());
    }    
   
        User user = new User();
         
         Dealer.cards();
    
         Dealer.deal();
         
         user.setCard(Dealer.deal());
         
          System.out.println(user.chckSum());
    
    if(user.chckSum().equals("true")){
        System.out.println("hitします");
        Dealer.hit();
        user.myCards.add(Dealer.hit().get(0));
        System.out.println("userの手札をオープン");
        System.out.println(user.open());
    }else{
        System.out.println("hitしません");
        System.out.println("userの手札をオープン");
        System.out.println(user.open());
    }

if(user.open()>dealer.open()){
    System.out.println("userの勝ちです。");
}else{
    System.out.println("dealerの勝ちです");
    

}
}

    
    
    
    
    
  
   
    
    

      }
    













    
   
        
     
    

