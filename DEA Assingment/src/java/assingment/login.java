package assingment;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class login
{
    Statement st;
    private Object conn;
    
    void adddetails(String username,int password)
    {
        connectToDb();     
        String sql ="INSERT INTO login_details(username,password) VALUES('"+username+"','"+password+"')";        
        try 
        {
            st.executeUpdate(sql);
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void connectToDb() 
    {
        String url="jdbc:mysql://localhost:3306/login";
        try
        {                         
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,"root","");
          st = con.createStatement();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }    

    void adddetails(String username, String password)
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
   }

