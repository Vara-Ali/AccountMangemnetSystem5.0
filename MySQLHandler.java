import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLHandler {
	
	public void MySQLDB (String str1,String str2,String str3,String str4,String str5)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","1234");
			
			//insertion
			String sql = "INSERT INTO account(acc_No, acc_Type, address, mob_No, name) VALUES(?,?,?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, str1);
			statement.setString(2, str2);
			statement.setString(3, str3);
			statement.setString(4, str4);
			statement.setString(5, str5);
			
			int rowInserted = statement.executeUpdate();
			if (rowInserted > 0)
			{
				System.out.println("New account added successfully");
			}
			
			
			//display
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from account");
			while(rs.next())
			{
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " " + rs.getString(5));
			}
			
			con.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
