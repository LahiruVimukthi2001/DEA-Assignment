<%-- 
    Document   : Feedback.jsp
    Created on : Oct 5, 2022, 7:15:00 PM
    Author     : Lahiru Vimukthi
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback JSP Page</title>
    </head>
    <body>
        <h1>Your Feedback Added</h1>
        <%               
           String fname=request.getParameter("fname");
           String lname=request.getParameter("lname");
           String mail=request.getParameter("mail");
           String country=request.getParameter("country");
           String subject=request.getParameter("subject");
              
           
           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO feedback_details(fname,lname,mail,country,subject) VALUES('"+fname+"','"+lname+"','"+mail+"','"+country+"','"+subject+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
