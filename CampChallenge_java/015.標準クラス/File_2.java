/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunclaas.java＿file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author guest1Day
 */
public class File_2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
    
//ファイルオープン 
File fp = new File("Test.txt");
//ファイルから読み出すクラス
FileReader fr = new FileReader(fp);
//効率的に読み出すクラス
BufferedReader br = new BufferedReader(fr);
//1行読み出し
System.out.println(br.readLine());
        System.out.println(fr.read());
       

br.close();
    
    }
}