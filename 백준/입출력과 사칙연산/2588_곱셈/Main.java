import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A= scanner.nextInt();
		int B= scanner.nextInt();
		
		int C=A*((B%100)%10);
		int D=A*((B%100)/10);
		int F=A*(B/100);
		int G=C+(10*D)+(100*F);
		
		System.out.println(C);
		System.out.println(D);
		System.out.println(F);
		System.out.println(G);

		
		
		scanner.close();
	}
}