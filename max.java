import java.io.*;
import java.util.*;

class maxi
{
	
	void cal()
	{
		int x,y,z;;
		Scanner s=new Scanner(System.in);
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if(x>y&&x>z)
		{System.out.println(x+"is greater");
		}
		else if (y>x && y>z)
		{ System.out.println(y+"is greater");
		}
		else
		{System.out.println(z+" is greater");
		}
	}
}
class max
{
	public static void main(String[] args)
	{
		maxi si = new maxi();
		si.cal();

		
		 
	}
}