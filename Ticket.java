package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Ticket 
{
    Statement st;
    private Object conn;
    
    void adddetails(String ticketid, String flightid, String flname, String fclass, String from, String to, String ddate, String dtime)
    {
        connectToDb();     
        String sql ="INSERT INTO ticket_details(ticketid,flightid,flname,fclass,from,to,ddate,dtime) VALUES('"+ticketid+"','"+flightid+"','"+flname+"','"+fclass+"','"+from+"','"+to+"','"+ddate+"','"+dtime+"')";        
      
    }

    private void connectToDb()
    {
        String url="jdbc:mysql://localhost:3306/ticket";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","");
        }
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Ticket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
