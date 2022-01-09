import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int count=0;
		int b=a;	
		
		while(true) {
	
			a=((a%10)*10) + (((a/10)+(a%10))%10);
			count++;
			if(a==b) {
				System.out.println(count);
				break;
			}
		}
	}
}
