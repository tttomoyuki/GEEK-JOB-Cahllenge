package jums;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;

/**
 *
 * @author guest1Day
 */
public class UserDataBeans implements Serializable {

    // 各フィールド作成
    private String name = "";

    private String year = "";

    private String month = "";

    private String day = "";

    private String type = "";

    private String tell = "";

    private String comment = "";

    // publicで引数無しのコンストラクタを作成
    // 処理記述なし
    public UserDataBeans() {
    }

    // Nameのgetter
    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    public String getMonth() {
        return this.month;
    }

    public String getDay() {
        return this.day;
    }

    public String getType() {
        return this.type;
    }

    public String getTell() {
        return this.tell;
    }

    public String getComment() {
        return this.comment;
    }

    //　各フィールドののsetter
    public void setName(String n) {
        this.name = n;
    }

    public void setYear(String y) {
        this.year = y;
    }

    public void setMonth(String m) {
        this.month = m;
    }

    public void setDay(String d) {
        this.day = d;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void setTell(String te) {
        this.tell = te;
    }

    public void setComment(String c) {
        this.comment = c;
    }

}
