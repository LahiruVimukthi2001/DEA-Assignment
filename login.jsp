<%-- 
    Document   : login
    Created on : Oct 1, 2022, 2:18:07 PM
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
        <title>Login JSP Page</title>
    </head>
    <body>
        <h1>Your Login values Added</h1>
        <%               
           String username=request.getParameter("username");
           String password=request.getParameter("password");           
           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO login_details(UserName,Password) VALUES('"+username+"','"+password+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
