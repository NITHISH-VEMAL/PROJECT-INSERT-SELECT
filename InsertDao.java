package product1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDao {
	
	String sql="insert into org values(?, ?, ?, ?)";
	String url="jdbc:mysql://localhost:3306/nithish";
	String username="root";
	String password="vns_1998";
	
	
	
	public void insert (String ftype, String ffor, String fdesc, int fcode){
			
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,username,password);
			PreparedStatement st=con.prepareStatement(sql);
			
			st.setString(1, ftype);
			st.setString(2, ffor);
			st.setString(3, fdesc);
			st.setInt(4, fcode);
			
			st.executeUpdate();				
			con.close();
		}
		catch(Exception e)
		{
			
		}
}
}