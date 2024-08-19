import java.util.*;w
public class hash
{
	public static void main(String[] args)
	{
		HashSet <String> a = new HashSet<String>();
		a.add("abi");
		a.add("soy");
		a.add("soy");
		Iterator i = a.iterator();

		while(i.hasNext())
		{System.out.println(i.next());}
	}
}