

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Dealer extends Human{

    //１～１３までの値を作成し、その中からランダムな数を戻り値として
    //返す。
    public static int cards(){
        
        ArrayList<Integer>cards=new ArrayList<Integer>();
        
       //（cardsに1から13までの値を入れる）処理を４回繰り返す。
       
           for(int i=1;i<13;i++){
           cards.add(i);
       
       }
        Random rand  = new Random();
        
       Integer index =rand.nextInt(cards.size());
        
       
    
       int c =(cards.get(index));  
       return c;
    }
    //cardsから二つの値をArrayList(deal)に入れて戻り値として渡す。
    public static ArrayList<Integer> deal(){
        ArrayList<Integer>deal=new ArrayList<Integer>();
        deal.add(cards());
        deal.add(cards());
        return deal;
    }
    //cardsから一つの値をArrayList(hit)に入れ戻り値として渡す。
    public static ArrayList<Integer> hit(){
        ArrayList<Integer>hit=new ArrayList<Integer>();
        hit.add(cards());
        return hit;
    }
    
    
    
  
       
        


    @Override
    //myCardsの値の合計をtotal変数に収納し戻り値とするメソッド
    public int open() {
        //int total = 0;
//for(int value: data1) {
   // total = total + value;}
//out.print(total);

// 数値配列 -- ArrayListも同じ方法でループ処理できます
// ArrayList<Integer> data2 = new ArrayList<Integer>();
int total=0;
for(int value:myCards){
    total=total+value;
    }
     return total;


       
       //To change body of generated methods, choose Tools | Templates.
    }

   
//ArrayListを引数とし、そのArrayListの中の値をmyCardsに収納するメソッド
    @Override
    public void setCard(ArrayList<Integer> x) {
         for(int value:x){
         myCards.add(value);
         }
   
      
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
    
            
        
       
        
    
            
     
    }
    

   












}    









    

    
        
     
    
    


    
    
   
   


    
    
 
 