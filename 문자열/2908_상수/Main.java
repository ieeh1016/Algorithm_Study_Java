import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		String aaa="";
		String bbb="";
		
		for(int i=str1.length()-1; i>=0; i--) {
			aaa=aaa+str1.charAt(i);
		}
		for(int i=str2.length()-1; i>=0; i--) {
			bbb=bbb+str2.charAt(i);
		}
		int a = Integer.parseInt(aaa);
		int b = Integer.parseInt(bbb);
		
		if(a>b) {
			System.out.print(a);
		}
		else {
			System.out.print(b);
		}
		
	}
}


	
