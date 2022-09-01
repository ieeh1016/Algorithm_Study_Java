import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		for(int j=1; j<=a; j++) {
			for(int k=1; k<=a-j; k++) {
				System.out.print(" ");
			}
			for(int i=1; i<=j; i++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
