import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a==b && b==c && a==c) {
			System.out.print(10000+(a*1000));
		}
		else if((a==b && a!=c && b!=c)) {
			System.out.print(1000+(a*100));
		}
		else if((b==c && b!=a && c!=a)) {
			System.out.print(1000+(b*100));
		}
		else if((a==c && a!=b && c!=b)) {
			System.out.print(1000+(a*100));
		}
		else{
			if(a>b && a>c) {
				System.out.print(a*100);
			}
			else if(b>a && b>c) {
				System.out.print(b*100);
			}
			else if(c>a && c>b) {
				System.out.print(c*100);
			}
		}
		
	}
}