package programPract;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class NoofCharsinString 
{
	public static void main(String args[])
	{
		String strMain = "Prasanna Krishna Sai";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<strMain.length();i++)
		{
			char strOnebyOne = strMain.charAt(i);
			if(hm.containsKey(strOnebyOne))
			{
				int cnt = hm.get(strOnebyOne);
				hm.put(strOnebyOne,cnt+1);
			}
			else
			{
				hm.put(strOnebyOne,1);
			}
		}
		
		System.out.println(hm);
		
		Set<Character> hs = hm.keySet();
		Iterator<Character> it =  hs.iterator();
		
		while(it.hasNext())
		{
			Character str= it.next();
			System.out.println("Number of times character "+str+" repeated is "+hm.get(str));
		}
	}
}
