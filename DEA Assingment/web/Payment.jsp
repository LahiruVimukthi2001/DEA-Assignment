<%-- 
    Document   : Payment
    Created on : Oct 2, 2022, 3:41:56 PM
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
        <title>Payment JSP Page</title>
    </head>
    <body>
         <h1>Your Payment values Added</h1>
        <%               
           String fname=request.getParameter("fname");
           String lname=request.getParameter("lname");
           String email=request.getParameter("email");
           String date=request.getParameter("date");
           String month=request.getParameter("month");
           String year=request.getParameter("year");
           String gender=request.getParameter("gender");
           String pay=request.getParameter("pay");   
           String cnumber=request.getParameter("cnumber");
           String cvc=request.getParameter("cvc");
          
           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO payment_details(fname,lname,email,date,month,year,gender,pay,cnumber,cvc) VALUES('"+fname+"','"+lname+"','"+email+"','"+date+"','"+month+"','"+year+"','"+gender+"','"+pay+"','"+cnumber+"','"+cvc+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
