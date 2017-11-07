package jums;

/**
 * ユーザー情報を格納するテーブルに対しての操作処理を包括する
 * DB接続系はDBManagerクラスに一任
 * 基本的にはやりたい1種類の動作に対して1メソッド
 * @author hayashi-s
 */
import base.DBManager;
import static java.lang.System.out;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.lang.System;
import java.io.*;
import java.util.ArrayList;

public class UserDataDAO {
    
    
     
    //インスタンスオブジェクトを返却させてコードの簡略化
    public static UserDataDAO getInstance(){
        return new UserDataDAO();
    }
    
    /**
     * データの挿入処理を行う。現在時刻は挿入直前に生成
     * @param ud 対応したデータを保持しているJavaBeans
     * @throws SQLException 呼び出し元にcatchさせるためにスロー 
     */
    public void insert(UserDataDTO ud) throws SQLException{
        Connection con = null;
        PreparedStatement st = null;
        
        
        try{
            con = DBManager.getConnection();
            st =  con.prepareStatement("INSERT INTO user_t(name,birthday,tell,type,comment,newDate) VALUES(?,?,?,?,?,?)");
            st.setString(1, ud.getName());
            java.sql.Date sd=new java.sql.Date(ud.getBirthday().getTime());
            st.setDate(2,sd);//指定のタイムスタンプ値からSQL格納用のDATE型に変更;//指定のタイムスタンプ値からSQL格納用のDATE型に変更
            st.setString(3, ud.getTell());
            st.setInt(4, ud.getType());
            st.setString(5, ud.getComment());
            st.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
            st.executeUpdate();
            System.out.println("insert completed");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
            }
        }

    }
    
    public ArrayList<String> select (UserDataDTO ud) throws SQLException{
        
        PrintWriter out = null;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet data = null;
         try{
             con = DBManager.getConnection();
             //SQL文〇
             st= con.prepareStatement("SELECT * FROM user_t WHERE name=? and birthday=? and type=?");
             //恐らく〇
             st.setString(1,ud.getName());
             java.sql.Date sd=new java.sql.Date(ud.getBirthday().getTime());
             st.setDate(2,sd);
             st.setInt(3,ud.getType());
            
             data = st.executeQuery();
             
             
                 ArrayList<String> user_list = new ArrayList<String>();
                 while(data.next()){
                    user_list.add(data.getString("name"));
                    user_list.add(data.getString("birthday"));
                    user_list.add(data.getString("type"));
                    user_list.add(data.getString("newdate"));
                }
                 return user_list;
             
                    
                   

         }catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
                st.close();
                data.close();
            }}
}
   public ArrayList<String> selectALL () throws SQLException{
        PrintWriter out = null;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet data = null;
        try{
             con = DBManager.getConnection();
             //SQL文〇
             st= con.prepareStatement("SELECT * FROM user_t ");
             //恐らく〇
            data = st.executeQuery();
            
             ArrayList<String> user_list = new ArrayList<String>();
                 while(data.next()){
                    user_list.add(data.getString("name"));
                    user_list.add(data.getString("birthday"));
                    user_list.add(data.getString("type"));
                    user_list.add(data.getString("newdate"));
                }
                 return user_list;


}catch(SQLException e){
            System.out.println(e.getMessage());
            throw new SQLException(e);
        }finally{
            if(con != null){
                con.close();
                st.close();
                data.close();
            }}
   }
}
