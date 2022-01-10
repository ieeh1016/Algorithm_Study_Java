import java.util.Scanner;


public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String str = scanner.next();
		
		int sum=0;
		
		for(int i=0; i<a; i++) {
			sum=sum+str.charAt(i)-'0';
		}
		System.out.print(sum);
	}

 
}


	
