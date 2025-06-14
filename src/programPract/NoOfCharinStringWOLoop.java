package programPract;

public class NoOfCharinStringWOLoop {

	public static void main(String[] args) {
		
		String str="Prasanna";
		int finalCnt =0;
		
		int mainStrCnt = str.length();
		
		int replaceCnt = str.replace("a","").length();
		
		finalCnt = mainStrCnt-replaceCnt;
		
		System.out.println("Number of occurance of Character a is "+finalCnt);
	}

}
