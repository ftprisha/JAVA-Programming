import java.io.*;
import java.util.*;
class soyfactors
{
	public static void main(String[] args)
	{	
		Scanner S =new Scanner(System.in);
		int n,d,r,s;
		System.out.println("Enter range");
		n=S.nextInt();
		for(int i=1;i<n;i++)
		{	
			d=i*i;
			if(d<n)
			{s=0;
				int temp =d;
				while(temp>0)
				{
					
					r=temp%10;
					s= s+r;
					temp=temp/10;
				}
			
				if(s<10)
				{
				System.out.println(d);
				}
			}
		}
		
	}
}