package qwerty;
import java.sql.*;  
class Student{  
public static void main(String args[]) throws SQLException,ClassNotFoundException{  
try{  
Class.forName("com.cj.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/sdp3","root","Student@1234");  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("CREATE TABLE STUDENT_INFO(NAME VARCHAR(200),EMAIL VARCHAR(200)"); 
System.out.println("succesfully crreated");
rs.close();   
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  