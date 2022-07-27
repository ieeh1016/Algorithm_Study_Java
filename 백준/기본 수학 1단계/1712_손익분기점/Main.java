import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int aaa=c-b;
		
		int count=1;
		
		if(b>=c) {
			System.out.print("-1");
		}
		else {
			while(true) {
				
				if(a>=aaa*count) {
					count++;
				}
				else {
					System.out.println(count);
					break;
				}
			}
		}
	}
	
}
