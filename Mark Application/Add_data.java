package Mark_Register;
import java.sql.*;
import java.util.*;
public class Add_data {
	void add_data()
	{
	int id;
	int m1;
	int m2;
	int m3;
	int total;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the student:");
	name=sc.nextLine();
	System.out.println("Enter Id:");
	id=Integer.parseInt(sc.nextLine());
	System.out.println("Enter subject marks");
	m1=Integer.parseInt(sc.nextLine());
	m2=Integer.parseInt(sc.nextLine());
	m3=Integer.parseInt(sc.nextLine());
	total=m1+m2+m3;
	add_to_db(id,name,m1,m2,m3,total);
	}
	static void add_to_db(int a,String b,int c,int d,int e,int f)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root", "");
		PreparedStatement stmt=conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");  
		stmt.setInt(1,a);  
		stmt.setString(2,b);
		stmt.setInt(3,c); 
		stmt.setInt(4,d);
		stmt.setInt(5,e);
		stmt.setInt(6,f); 
		int i=stmt.executeUpdate();  
		System.out.println(i+" Records inserted");  
		conn.close();
		}
		catch(Exception z)
		{
		System.out.print("Do not connect to DB - Error:"+z);
		}
		
	}
	
	

}
