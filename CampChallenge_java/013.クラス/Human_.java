
import static java.lang.System.out;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class Human_ {


    public String name ="java";
    public int age = 0;
   
public void setHuman(String n,int a){
        
      name = n;
      age = a;
      
      System.out.println(n);
      System.out.println(a);
      
}



    public static void main(String[] args) {
        // Humanクラスのインスタンス(hito)生成
        Human hito = new Human();

        // 人インスタンスのageフィールドへ年齢設定
        hito.age = 40;

        // 人インスタンスのsetHumanメソッドを利用
        //setHumanメソッドに"添田亮司"と38という値を設定し
        //またsetHumanメソッドにはsoutが設定されているため呼び出すとそれらを表示する
        hito.setHuman("添田亮司",38);
        
        
        
        
    }
}








        

