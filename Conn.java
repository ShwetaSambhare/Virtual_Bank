
package bankmanagementsystem;
import java.sql.*;

public class Conn {

    Connection c;   //establishing connection
    Statement s;    //creating connection
   public Conn(){
       try
       {
          // Class.forName(Conn.mysql.cj.jdbc.Driver);   //class forname is a class and method
           
           c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "12345");
           s = c.createStatement();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
   
}
