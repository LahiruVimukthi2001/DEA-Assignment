package assingment;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class StaffAccount 
{

     Statement st;
    private Object conn;    
    
    void adddetails(String fname, String Lname, String email, String address, String country, String gender, String bday, String pnumber, String uname, String password, String rpassword)
    {
        connectToDb();  
        String sql="INSERT INTO staff_details(fname,Lname,email,address,country,gender,bday,pnumber,uname,password,rpassword) VALUES('"+fname+"','"+Lname+"','"+email+"','"+address+"','"+country+"','"+gender+"','"+bday+"','"+pnumber+"','"+uname+"','"+password+"','"+rpassword+"')";
        try 
        {
            st.executeUpdate(sql);
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    }

    private void connectToDb() 
    {
         String url="jdbc:mysql://localhost:3306/staffaccount";
        try
        {                         
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,"root","");
          st = con.createStatement();
        }  
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(UserAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
