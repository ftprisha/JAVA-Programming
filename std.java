import java.io.*;
import java.util.*;

class student
{
	int m1,m2,m3,m4,m5,tot,avg;
	void getdata()
	{
	Scanner s =new Scanner(System.in);
	System.out.println("enter marks");
	
	m1=s.nextInt();
	m2=s.nextInt();
	m3=s.nextInt();
	m4=s.nextInt();
	m5=s.nextInt();
	
	}
		
	
	void cal()
	{
		
		
		tot=m1+m2+m3+m4+m5;
		avg=tot/5;
		System.out.println("total=" +tot);
		System.out.println("average=" +avg);
	}
	void grade()
	{
				
		if(avg>90)
		{
			System.out.println("A GRADE");
		}
		else if (avg>80 && avg <=90)
		{ 
			System.out.println("B GRADE");
		}
		else if(avg>70 && avg <=80)
		{
			System.out.println(" C GRADE");
		}
		else if(avg>60 && avg <=70)
		{
			System.out.println(" D GRADE");
		}
		else
		{ System.out.println("E GRADE");
		}

	}
}
class std
{
	public static void main(String[] args)
	{
		student st = new student();
		st.getdata();
		st.cal();
		st.grade();


		
		 
	}
}