package bank.management.system;

import java.sql.*;

public class Conn {
//create connection 
    Connection c;
    Statement s;
    public Conn(){
        
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);
            //create the connectuon
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Santosh@529");
            s=c.createStatement();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
   
  
}
