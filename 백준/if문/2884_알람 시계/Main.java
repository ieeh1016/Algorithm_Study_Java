import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(a>=1) {
			if(b>=45) {
				int c=b-45;
				System.out.print(a+" "+c);
			}
			else {
				a--;
				int c=60+b;
				c=c-45;
				System.out.print(a+" "+c);
			}
		}
		else {
			if(b>=45) {
				int c=b-45;
				System.out.print(a+" "+c);
			}
			else {
				a=23;
				int c=60+b;
				c=c-45;
				System.out.print(a+" "+c);
			}
		}

	}
}
