package Mark_Register;
import java.util.*;
public class MainClass {
	public static void main(String[] args)
	{
		System.out.println("MARK REGISTER");
		int choice;
		int ex;
		do
		{
			System.out.println("MENU:");
			System.out.println("1.Add new");
			System.out.println("2.Search and View");
			System.out.println("3.Delete");
			Scanner scan=new Scanner(System.in);
			choice=Integer.parseInt(scan.nextLine());
			switch(choice)
			{
			case 1:
			{
				add();
				break;
			}
			case 2:
			{
				search();
				break;
			}
			case 3:
			{
				delete();
			}
			}
			System.out.println("Do you want to continue?(yes(1)/no(0))");
			ex=Integer.parseInt(scan.nextLine());
		}
			while(ex==1);
			
		}
	static void add()
	{
		Add_data ad=new Add_data();
		ad.add_data();
	}
	static void search()
	{
		Search_class s=new Search_class();
		s.search_data();
	}
	static void delete()
	{
		Delete_class del=new Delete_class();
		del.delete_data();
	}
	}


