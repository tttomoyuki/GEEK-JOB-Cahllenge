
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
public class User extends Human{

 //myCardsの値の合計をtotal変数に収納し戻り値とするメソッド
    @Override
 public int open() {
        //int total = 0;
//for(int value: data1) {
   // total = total + value;}
//out.print(total);


int total=0;
for(int value:myCards){
    total=total+value;
   
}
 return total;

       
       //To change body of generated methods, choose Tools | Templates.
    }

   
//ArrayListを引数とし、そのArrayListの中の値をmyCardsに収納するメソッド
    @Override
    public  void setCard(ArrayList<Integer> x) {
         for(int value:x){
         myCards.add(value);
         }
        //To change body of generated methods, choose Tools | Templates.
    }

    //myCardsの中の値の合計を計算,17以上ならelseの文を、以下ならtrueの文を送る。
    @Override
    public String chckSum() {
         int sum = 0;
        for(int value:myCards){
           sum = sum+value;
        }
        if(sum>=17){
            return("else");
        }else{
            return("true");
            
        }
    
            
         //To change body of generated methods, choose Tools | Templates.
    }
}
    

   















