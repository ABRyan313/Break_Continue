package breakContinue;
import java.util.*;
public class Main {
	
	private static Random rand = new Random();
	
	private static void test1() {
		int arr[] = { 1,2,3,4,5,6,7,8,9};
		int dhur = rand.nextInt(29) + 1;
		int n = -1;
		
		for (int i=0; i<arr.length; i++) 
			
			if( arr[i] == dhur ) {
				n = i;
			break;
			}
		if (n >= 0) 
			System.out.println(dhur + " " + "found on place number" + " " +n);
		else
			System.out.println(dhur +" "+ "not found");
	}
	
	private static String create() {
		
		String text = "abcdefghijklmnopqrstuvwxyz123456789";
		String line = "";
		for (int i = 0, n = rand.nextInt(30) + 10; i < n; ++i)
			line += text.charAt(rand.nextInt(text.length()));
		return line;
	}
	
	public static void test2() {
		
		int arr[] = { 1,2,3,4,5,6,7,8,9};
		int dhur1;
		int n = -1;
		
		found:
			for(;;) {
			 dhur1 = rand.nextInt(29) + 1;
			 for(int i = 0; i < arr.length; i++);
			 if (arr[i] == dhur1){
				 n = i;
				 break found;
			 } 
			 
		}
		
		 System.out.println(dhur1 + " found on place number " + n);
	}
	
	private static void test3() {
		
		String text = create();
		String tal = "";
		
		 for (int i = 0; i < text.length(); ++i) {
			char c = text.charAt(i);
			if(c < '0' || c > '9') continue;
			tal+=c;
				
		}
		 System.out.println(tal);
	}
	
	
	

	public static void main(String[] args) {
		
		
		test1();
		test2();
		test3();

	}

}
