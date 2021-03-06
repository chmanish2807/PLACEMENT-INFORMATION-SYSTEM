import java.sql.*;

public class Validate {
    public static boolean checkUser(String email,String pass) 
    {
        boolean st =false;
        try {          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            PreparedStatement ps = con.prepareStatement("select * from Student where email=? and pass=?");
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();
            st = rs.next();

        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;                 
    }   
    public static boolean isTeacher(String email) 
    {
        boolean st =false;
        try {          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            Statement ps = con.createStatement();
            ResultSet rs =ps.executeQuery("select * from Student where email like '"+email+"';");
            String val = null;
            while(rs.next()) {
            	val=rs.getString(4);
            }
            if(val.equals("on")) {
            	st=true;
            }
            else {
            	st=false;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;       
    }   
    public static boolean filled(String email) 
    {
        boolean st =false;
        try {          
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            Statement ps = con.createStatement();
            String q="select * from applications where  Email_Id like '"+email+"';";
            ResultSet rs =ps.executeQuery(q);
            System.out.println(q);
            int c=0;
            while(rs.next()) {
            	c++;
            }          
            if(c>0) {
            	st=true;
            }
            else {
            	st=false;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;       
        
    }   
    public static String cat(String email) 
    {
    	 String  c="";
        try {          
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            Statement ps = con.createStatement();
            String q="select  category from applications where  Email_Id like '"+email+"';";
            ResultSet rs =ps.executeQuery(q);
            System.out.println(q);
            while(rs.next()) {
            	c=rs.getString(1);
            }
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(c);
        return c;       
        }
  
    public static boolean checkid(String id) 
    {
        boolean st =false;
        try {          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            Statement ps = con.createStatement();
            ResultSet rs =ps.executeQuery("select * from teacherapproval where id like '"+id+"';");
            String val = null;
            while(rs.next()) {
            	val=rs.getString(2);
            	System.out.println();
            }
            if(val.equals(id)) {
            	st=true;
            }
            else {
            	st=false;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;       
    }   
    
   //---------- 
    
    public static boolean forgot(String email) 
    {
        boolean st =false;
        try {          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            Statement ps = con.createStatement();
            ResultSet rs =ps.executeQuery("select * from Student where email like '"+email+"';");
            String name=null;
            while(rs.next()){
             name=rs.getString(2);
            }
			if(email.equals(name)) {
            	st=true;
            }
            else {
            	st=false;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;       
    }   
    public static boolean isupdate(String email,String pass) 
    {
        boolean st =false;
        try {          
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab","root","@9848396526At");
            PreparedStatement ps=con.prepareStatement("update  Student set pass = ? where email like ?");
            ps.setString(1, pass);
            ps.setString(2, email);
            int i=ps.executeUpdate();
			if(i > 0) {
            	st=true;
            }
            else {
            	st=false;
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        return st;       
    }   
    
    
    
    
} 
