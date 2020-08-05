package mySQLtest;

import java.sql.*;

public class Mysqltest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String dbname = "test2";
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/"+dbname+"?serverTimezone=UTC&"+"allowPublicKeyRetrieval=true&useSSL=false";
			conn = DriverManager.getConnection(url, "root", "0506");
			System.out.println("연결 성공!");
			
			stmt = conn.createStatement();
			String sql = "select student_id, student_name, major_code, grade from " + dbname + ".student"; 
			rs = stmt.executeQuery(sql);
			
//			sql = "insert into " + dbname + ".student values(?, ?, ?, ?)";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "2020123333");
//			pstmt.setString(2, "XJGHO");
//			pstmt.setString(3, "003");
//			pstmt.setString(4, "A");
//			
//			int count = pstmt.executeUpdate();
//			if (count == 0)
//			{
//				System.out.println("fail insert");
//			}
//			else
//			{
//				System.out.println("success insert " + count);
//			}
			
//			sql = "delete from " + dbname + ".student where student_id = ?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "2009038033");
//			int count = pstmt.executeUpdate();
//			if (count == 0)
//			{
//				System.out.println("fail delete");
//			}
//			else
//			{
//				System.out.println("success delete " + count);
//			}
			
			sql = "update " + dbname + ".student set student_name = ?" + " where student_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			
			while(rs.next())
			{
				System.out.println(rs.getString(1) + '\t' + rs.getString(2) + '\t' + rs.getString(3) + '\t' + rs.getString(4));
			}
		}
		catch (Throwable e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if (conn != null && !conn.isClosed())
				{
					conn.close();
				}
			}
		}
		
	}

}
