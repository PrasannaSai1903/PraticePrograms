package programPract;

public class ReverseStrWithPreservChars
{
	public static void main(String args[])
	{
		String strMain = "Prasanna Krishna Sai Ambati";
		String[] arrSplit = strMain.split(" ");
		String strReversed = "";
		
		for(int i=0;i<arrSplit.length;i++)
		{
			String revString = "";
			String spliString = arrSplit[i];
			System.out.println(spliString);
			for(int j=spliString.length()-1;j>=0;j--)
			{
				revString = revString+spliString.charAt(j);
			}
			strReversed = strReversed+" "+revString;
		}
		System.out.println("Reversed String with Preserved Position: "+strReversed);
	}
}
