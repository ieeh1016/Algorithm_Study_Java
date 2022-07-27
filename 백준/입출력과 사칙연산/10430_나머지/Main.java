import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A= scanner.nextInt();
		int B= scanner.nextInt();
		int C= scanner.nextInt();
		
		int D=(A+B)%C;
		int F=((A%C) + (B%C))%C;
		int G=(A*B)%C;
		int H=((A%C)*(B%C))%C;
		
		System.out.println(D);
		System.out.println(F);
		System.out.println(G);
		System.out.println(H);

		
		
		scanner.close();
	}
}