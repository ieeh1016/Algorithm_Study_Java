import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int count=1;
		int sum=0;
		int result=0;
		int c=0;
		if(a==1) {
			System.out.print("1");
		}
		else {
			while(result<=a) {
					c=6*count;
					sum=sum+c;
					result=sum+2;
					count++;
			}
		
		System.out.print(count);
	}
}
}
