<%-- 
    Document   : UserAccount
    Created on : Oct 1, 2022, 3:25:12 PM
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
        <title>User JSP Page</title>
    </head>
    <body>
        <h1>User Account Details are Added.</h1>
        
        <%               
           String fname=request.getParameter("fname");
           String Lname=request.getParameter("Lname");
           String email=request.getParameter("email");
           String address=request.getParameter("address");
           String country=request.getParameter("country"); 
           String gender=request.getParameter("gender");
           String bday=request.getParameter("bday");
           String pnumber=request.getParameter("pnumber");
           String uname=request.getParameter("uname");
           String password=request.getParameter("password"); 
           String rpassword=request.getParameter("rpassword");
           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/useraccount","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO user_details(fname,Lname,email,address,country,gender,bday,pnumber,uname,password,rpassword) VALUES('"+fname+"','"+Lname+"','"+email+"','"+address+"','"+country+"','"+gender+"','"+bday+"','"+pnumber+"','"+uname+"','"+password+"','"+rpassword+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
