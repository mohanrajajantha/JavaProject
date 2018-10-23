package Mark_Register;
import java.util.*;
import java.sql.*;
public class Delete_class {
	void delete_data()
	{
		Scanner in=new Scanner(System.in);
		int delid=Integer.parseInt(in.nextLine());
		delete_from_db(delid);
	}
	static void delete_from_db(int delid)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root", "");
		PreparedStatement stmt=conn.prepareStatement("delete from marksheet where id=?");
		stmt.setInt(1,delid);
		int i=stmt.executeUpdate();  
		System.out.println(i+" Records deleted");  
		conn.close();
		}
		catch(Exception z)
		{
		System.out.print("Do not connect to DB - Error:"+z);
		}
		
	}
}
