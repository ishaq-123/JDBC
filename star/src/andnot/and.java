package andnot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class and {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
    
		getConnection();
	}
    public static Connection getConnection () throws Exception{
    	try {
    		String driver="com.mysql.cj.jdbc.Driver";
    		String url= "jdbc:mysql://127.0.0.1:3306/star";
    		String username="root";
    		String password="";
    		Class.forName(driver);
    		
    		Connection conn=DriverManager.getConnection(url,username,password);
    		//System.out.print("Connected");
    		Statement s=conn.createStatement();
    		ResultSet rs=s.executeQuery("select * from product where product_name='shoes' and seller_city='peshawer'");
    		while(rs.next())
    			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
    		conn.close();
    		return conn;
    	}
    	catch(Exception e)
    	{
    System.out.println(e);
}
return null;
}
}
    		
    	 

