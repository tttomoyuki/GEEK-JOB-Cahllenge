/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunclaas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class TimeStamp_4 {
    
    public static void main(String[] args) throws ParseException{
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
       
   
    Date d1 = sdf.parse("2015/1/1 0:0:0");
    
    Date d2 = sdf.parse("2015/12/31 23:59:59");
    
        System.out.println("2015/1/1 0:0:0と2015/12/31 23:59:59"
        +"の差は");
        System.out.println(d2.getTime()-d1.getTime());
        System.out.println("ミリ秒です。");
    
}
}
