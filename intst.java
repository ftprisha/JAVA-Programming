import java.io.*;
import java.util.*;

class simple
{
	
	void cal()
	{
		int p,r,t;
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		r=s.nextInt();
		t=s.nextInt();
		System.out.println((p*r*t)/100);
	}
}
class intst
{
	public static void main(String[] args)
	{
		simple si = new simple();
		si.cal();

		
		 
	}
}