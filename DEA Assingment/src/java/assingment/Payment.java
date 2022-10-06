package assingment;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Payment 
{
    Statement st;
    private Object conn;

    void adddetails(String fname, String lname, String email, String date, String month, String year, String gender, String pay, String cnumber, String cvc) 
    {
        try {     
            connectToDb();
        } catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql ="INSERT INTO payment_details(username,password) VALUES('"+fname+"','"+lname+"','"+email+"','"+date+"','"+month+"','"+year+"','"+gender+"','"+pay+"','"+cnumber+"','"+cvc+"')";        
        try 
        {
            st.executeUpdate(sql);
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectToDb() throws SQLException 
    {
         String url="jdbc:mysql://localhost:3306/payment";
                             
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
          Connection con = null;
        try {
            con = DriverManager.getConnection(url,"root","");
        } catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
          st = con.createStatement();
        
    }
    
}
