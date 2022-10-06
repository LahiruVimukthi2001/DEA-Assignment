
package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Feeback 
{
     Statement st;
    private Object conn;

    void adddetails(String fname,String lname,String mail, String country,String subject)
    {
        connectToDb();     
        String sql ="INSERT INTO feedback_details(fname,lname,mail,country,subject) VALUES('"+fname+"','"+lname+"','"+mail+"','"+country+"','"+subject+"')";        

    }

    private void connectToDb() 
    {
         try {
              String url="jdbc:mysql://localhost:3306/feedback";      
             try {
                 Class.forName("com.mysql.jdbc.Driver");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Feeback.class.getName()).log(Level.SEVERE, null, ex);
             }
              Connection con = DriverManager.getConnection(url,"root","");
        } catch (SQLException ex) {
             Logger.getLogger(Feeback.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
