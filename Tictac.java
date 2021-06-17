import java.util.*;
public class Tictac
{
    char[][] tk = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
	ArrayList <Integer> Turns=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	void check(int pos)
    {
        Turns.remove(new Integer(pos));
    }
    void update(int position,char player)
	{
	 switch (position){
	  case 1:
	    tk[0][0]=player;
		break;
	  case 2:
	    tk[0][1]=player;
		break;
	  case 3:
	    tk[0][2]=player;
		break;
	  case 4:
	    tk[1][0]=player;
		break;
	  case 5:
	    tk[1][1]=player;
		break;
	  case 6:
	    tk[1][2]=player;
		break;
	  case 7:
	    tk[2][0]=player;
		break;
	  case 8:
	    tk[2][1]=player;
		break;
	  case 9:
	    tk[2][2]=player;
		break;
	  default :
	    break;
	}
	}
	
	
    void display()
    {   
	   System.out.println('\n');
        for (int m=0;m<=2;m++)
        {
            for (int n=0;n<=2;n++)
            {
                System.out.print(tk[m][n]);
                System.out.print("|");   
            }
            
            if(m!=2)
            {
            System.out.println('\n');
            System.out.print("- - -");
            System.out.println('\n');
            }
        }
		System.out.println('\n');
    }
     int checkWinner(char ply)
	{
	  if ((tk[0][0]==ply&&tk[0][1]==ply&&tk[0][2]==ply)||
	      (tk[0][0]==ply&&tk[1][1]==ply&&tk[2][2]==ply)||
		  (tk[0][0]==ply&&tk[1][0]==ply&&tk[2][0]==ply)||
		  (tk[0][1]==ply&&tk[1][1]==ply&&tk[2][1]==ply)||
		  (tk[0][2]==ply&&tk[1][2]==ply&&tk[2][2]==ply)||
		  (tk[1][0]==ply&&tk[1][1]==ply&&tk[1][2]==ply)||
		  (tk[2][0]==ply&&tk[2][1]==ply&&tk[2][2]==ply)||
		  (tk[2][0]==ply&&tk[1][1]==ply&&tk[0][2]==ply))
		  {
		  return 1;
		  }
		  else
		  {
		  return 0;
    }
	}

	
	public static void main(String[] args) {
		System.out.println("*****************************************************************************");
		System.out.println("                     Welcome to TIC-TAC-TOE Game                             ");
		System.out.println("*****************************************************************************\n");
		int playerflag=0;
		int winningstat=0;
		int getin=0;
		char currentplayer='X';
		Scanner sc=new Scanner(System.in);
		Tictac m=new Tictac();
		System.out.println("*****************************************************************************");
		System.out.println("                      Player 1 is 'X'                                        ");
		System.out.println("                      Player 2 is 'O'                                        ");
		System.out.println("*****************************************************************************");
		m.display();
		
			while ( true)
			{
	    if (m.Turns.size() > 0)
	    {
			if (playerflag==0)
			{
			System.out.println("Player 1 Enter:");
			currentplayer='X';
			}
			else
			{
			System.out.println("Player 2 Enter:");
			currentplayer='O';
			}
	    getin=sc.nextInt();
	    if ( m.Turns.contains(getin) )
	    {
		m.update(getin,currentplayer);
		m.display();
	    m.check(getin);
		winningstat=m.checkWinner(currentplayer);
		if (winningstat==1)
		{
		System.out.println("*****************************************************************************");
		System.out.printf("                       Player %C has won the match                             \n",currentplayer);
		System.out.println("*****************************************************************************");
		break;
	    }
		else
		{
		// continue;
		}
		}
	    else
	    {
	        System.out.println("Sorry select another ");
			if (playerflag==0)
			{
			playerflag=1;
			}
			else
			{
			playerflag=0;
			}
	    }
	    }
	    else
	    { 
		    System.out.println("*****************************************************************************");
	        System.out.println("                  The match has ended in Tie                                 ");
			System.out.println("*****************************************************************************");
	        break;
	    }
		if( playerflag==1)
		{
		playerflag=0;
		}
		else
		{
		playerflag=1;
		}
		
	
	}
}
}
