import java.util.Scanner;


public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int a = scanner.nextInt();
		for(int i=0; i<a; i++) {
			int b = scanner.nextInt();
			String str = scanner.next();
			for(int j=0; j<str.length(); j++) {
				char s = str.charAt(j);
				for(int k=0; k<b; k++) {
					System.out.print(s);
				}
			}
			System.out.println();
		}
	}
}


	
