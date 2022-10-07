<%-- 
    Document   : TicketDetails
    Created on : Oct 3, 2022, 11:46:47 PM
    Author     : Lahiru Vimukthi
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ticket JSP Page</title>
    </head>
    <body>
         <h1>Your Ticket values Added</h1>
        <%               
           String ticketid=request.getParameter("ticketid");
           String flightid=request.getParameter("flightid"); 
           String flname=request.getParameter("flname"); 
           String fclass=request.getParameter("fclass"); 
           String from=request.getParameter("from"); 
           String to=request.getParameter("to"); 
           String ddate=request.getParameter("ddate"); 
           String dtime=request.getParameter("dtime"); 

           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticket","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO ticket_details(ticketid,flightid,flname,fclass,from,to,ddate,dtime) VALUES('"+ticketid+"','"+flightid+"','"+flname+"','"+fclass+"','"+from+"','"+to+"','"+ddate+"','"+dtime+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
