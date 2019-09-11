package product1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckDao {
	
	
	String sql="select * from intro where uname=? and ucode=?";
	String url="jdbc:mysql://localhost:3306/nithish";
	String username="root";
	String password="vns_1998";
	
	
	
	public boolean check(String namee, String codee){
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, namee);
			st.setString(2, codee);
			
			
			
			
			ResultSet rs= st.executeQuery();	
			if(rs.next())
			return true;
			
			
		}
		catch(Exception e)
		{
			
		}
		return false;
		
	}
	
}