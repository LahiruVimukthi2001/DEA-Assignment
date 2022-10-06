package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Feedback 
{
     Statement st;
    private Object conn;
    
    void adddetails(String fname, String lname, String email, String country, String subject) 
    {
        connectToDb();     
        String sql ="INSERT INTO feedback_details(username,password) VALUES('"+fname+"','"+lname+"','"+email+"','"+country+"','"+subject+"')";        
    }

    private void connectToDb()
    {
         try {
             String url="jdbc:mysql://localhost:3306/feedback";
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = null;
             try {
                 con = DriverManager.getConnection(url,"root","");
             } catch (SQLException ex) {
                 Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
             }
             st = con.createStatement();
             
             
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
         } catch (SQLException ex) {
             Logger.getLogger(Feedback.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    
    }

    void adddetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
