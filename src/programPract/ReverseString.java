package programPract;

public class ReverseString
{
	public static void main(String args[])
	{
		String str="Prasanna Sai";
		String revStr = "";
		String revStr2 = "";
		
		for(int i=0;i<str.length();i++)
		{
			revStr=str.charAt(i)+revStr;					
		}
		System.out.println("Reverse String: "+revStr);
		
		String str1="Ambati";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			revStr2=revStr2+str1.charAt(i);
		}
		
		System.out.println("Reverse Second String: "+revStr2);
	}
}
