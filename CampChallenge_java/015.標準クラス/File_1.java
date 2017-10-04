/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyouzyunclaas.java＿file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author guest1Day
 */
public class File_1 {
    
    public static void main(String[] args) throws IOException{
       //ファイルオープン 
        File fp = new File("Test.txt");
        //FileWriterクラスでインスタンスを取得（↑でオープンしたファイルを指定）
        FileWriter fw = new FileWriter(fp);
        //書き込み（writeメソッド)
        fw.write("初めまして！");
        fw.write("私の名前は武田です。");
        fw.write("よろしくお願いします");
        //クローズ（closeメソッド)
        fw.close();
        
    }
    
    
    
}
