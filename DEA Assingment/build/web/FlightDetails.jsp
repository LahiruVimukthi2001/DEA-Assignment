<%-- 
    Document   : FlightDetails
    Created on : Oct 4, 2022, 8:35:30 PM
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
        <title>Flight JSP Page</title>
    </head>
    <body>
         <h1>Your Flight values Added</h1>
        <%               
           String flightid=request.getParameter("flightid");            
           String capacity=request.getParameter("capacity");  
           String from=request.getParameter("from"); 
           String to=request.getParameter("to"); 
           String date=request.getParameter("date"); 
           String time=request.getParameter("time");
           String flname=request.getParameter("flname"); 

           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO flight_details(flightid,capacity,from,to,date,time,flname) VALUES('"+flightid+"','"+capacity+"','"+from+"','"+to+"','"+date+"','"+time+"','"+flname+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
