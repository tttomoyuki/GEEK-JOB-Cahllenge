/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunclaas;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class TimeStamp_2 {
    
    public static void main(String[] args){
    
        Date d = new Date();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        System.out.println(sdf.format(d));
    
    
    }
    
    
    
}
