package programPract;

public class NoofWordsinString {

	public static void main(String[] args) {
		
		String str= "Prasanna Krishna Sai";
		String[] arrStr = str.split(" ");
		
		System.out.println("Number of words in a String: "+arrStr.length);
		int cnt =1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
					{
						cnt = cnt+1;
					}
		}
		
		System.out.println("Enter number of words in String: "+cnt);
	}

}
