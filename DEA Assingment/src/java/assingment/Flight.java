package assingment;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.print.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Flight
{
    Statement st;
    private Object conn;
    
    void adddetails(String flightid,String capacity, String from, String to,String date, String time, String flname) 
    {
        connectToDb();     
        String sql ="INSERT INTO flight_details(flightid,capacity,from,to,date,time,flname) VALUES('"+flightid+"','"+capacity+"','"+from+"','"+to+"','"+date+"','"+time+"','"+flname+"')";        
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
         String url="jdbc:mysql://localhost:3306/flight";
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

   
}
