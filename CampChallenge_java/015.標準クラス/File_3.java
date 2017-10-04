/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunclaas.java＿file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author guest1Day
 */
public class File_3 {
    
    public static void main(String[] args) throws IOException{
        File fp = new File("test.txt");
        //trueを入れる事で上書きではなく追記になる
        FileWriter fw = new FileWriter(fp,true);
        //書き込み
        fw.write("<br>");
        fw.write("文字を追記しました");
        
        fw.close();
        
    }
    
}
