package Mark_Register;
import java.util.*;
import java.sql.*;
public class Search_class {
	void search_data()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Id to search:");
		int ID=Integer.parseInt(scan.nextLine());
		search_to_db(ID);
	}
	static	void search_to_db(int no)
		{
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root", "");
			PreparedStatement stmt=conn.prepareStatement("select id,name,subject1,subject2,subject3,total from marksheet where id=?");  
			stmt.setInt(1,no);  
			ResultSet rs=stmt.executeQuery();
			while(rs.next())
			{
				int idno=rs.getInt(1);
				String NAME=rs.getString(2);
				int mark1=rs.getInt(3);
				int mark2=rs.getInt(4);
				int mark3=rs.getInt(5);
				int totalmarks=rs.getInt(6);
				System.out.println("Id : "+idno+" Name : "+NAME+" Subject marks : "+mark1+" "+mark2+" "+mark3+" Total : "+totalmarks);
			}
			
			conn.close();
			}
			catch(Exception z)
			{
			System.out.print("Do not connect to DB - Error:"+z);
			}
			
	}

}
