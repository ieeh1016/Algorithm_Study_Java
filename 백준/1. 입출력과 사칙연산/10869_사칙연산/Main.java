import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int h=a%b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
		
		
		
		scanner.close();
	}
}