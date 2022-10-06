<%-- 
    Document   : ContactDetails
    Created on : Oct 3, 2022, 9:15:25 PM
    Author     : Lahiru Vimukthi
--%>

<%@page import="java.util.jar.Attributes.Name"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact JSP Page</title>
</head>
<body>
        <h1>Your Contact Details Added</h1>
        <%               
           String FirstName=request.getParameter("FirstName");
           String LastName=request.getParameter("LastName");
           String Country=request.getParameter("Country");
           String Subject=request.getParameter("Subject");   
           
           //1.load the driver
           Class.forName("com.mysql.jdbc.Driver");
           //2.connect to the db         
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contact","root","");
           //3.create statement
           Statement st=con.createStatement();
           //4.execute the sql quary
           String sql="INSERT INTO contact_details(FirstName,LastName,Country,Subject) VALUES('"+FirstName+"','"+LastName+"','"+Country+"','"+Subject+"')";
           st.executeUpdate(sql);
        %>
    </body>
</html>
