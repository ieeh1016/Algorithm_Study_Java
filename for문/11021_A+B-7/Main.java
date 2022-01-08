import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		for(int i=1; i<=a; i++) {
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			int d= b+c;
			System.out.println("Case #"+i+": "+d);
		}
		
	}
}
