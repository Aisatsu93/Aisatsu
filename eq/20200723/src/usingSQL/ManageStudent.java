package usingSQL;

import java.sql.*;

public class ManageStudent
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Connection conn = null;
		String dbname = "test";
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+dbname+"?serverTimezone=UTC&useSSL=false";
			conn = DriverManager.getConnection(url, "root", "0506");
			System.out.println("연결 성공!");
			
			stmt = conn.createStatement();
			String sql = "select * from " + dbname +".person";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
	}

}
