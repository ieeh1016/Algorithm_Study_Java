import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[] = new int[10];
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int answer = a*b*c;
		
		String str = Integer.toString(answer);
		
		for(int i=0; i<10
				; i++) {
			int count=0;
			for(int j=0; j<str.length(); j++) {
				if((str.charAt(j)-'0')==i) {
					count++;
				}
			}
			System.out.println(count);
		}
		


	}
		
}
