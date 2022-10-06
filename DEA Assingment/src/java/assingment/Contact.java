package assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

class Contact
{
    Statement st;
    private Object conn;

    void adddetails(String FirstName, String LastName, String Country, String Subject)
    {
        connectToDb();     
        String sql ="INSERT INTO contact_details(FirstName,LastName,Country,Subject) VALUES('"+FirstName+"','"+LastName+"','"+Country+"','"+Subject+"')";        

    }

    private void connectToDb()
    {
          try {
              String url="jdbc:mysql://localhost:3306/contact";      
             Class.forName("com.mysql.jdbc.Driver");
              Connection con = DriverManager.getConnection(url,"root","");
        }
          catch (ClassNotFoundException ex)
          {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        } 
          catch (SQLException ex) {
            Logger.getLogger(Contact.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }

  
    
}
