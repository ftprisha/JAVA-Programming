import java.util.*;
public class iter
{
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("Viji");
		a.add("Charmi");
		a.add("Prasha");

		Iterator i = a.iterator();
		while(i.hasNext())
		{System.out.println(i.next());}
	}
}