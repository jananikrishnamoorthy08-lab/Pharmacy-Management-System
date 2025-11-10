/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sarav
 */
public class ConnectionProvider {
    public static void main(String args[]){
}
    public static Connection getcon(){
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useSSL=false","root","*&123abc");
        return con; 
     }
     catch(Exception e){
       // System.out.println(e);
       e.printStackTrace();
        return null;
    }
    }
}
