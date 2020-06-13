/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.chernenko.queringmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author echernenko
 */
public class QueringMysql {
    public static void main(String[] args) {
      
        System.out.print("hello world \n");
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://188.226.174.244:3306/alias?characterEncoding=utf8&useUnicode=true", "aliasUser", "aliasPassword77");
            Statement mystatement = con.createStatement();
            mystatement.executeQuery("SET NAMES utf8");
            Statement mystatement2 = con.createStatement();
            ResultSet wordsSet=mystatement2.executeQuery("select * from words limit 1");
            while(wordsSet.next())
            {
                String s1 = wordsSet.getString("word"); 
                System.out.println(s1+"  "+wordsSet.getString("last_fetched"));  
            }
        } catch (Exception e){
            System.out.println(e);
        }
        
        System.out.print("bye world \n");
        
    }
}
