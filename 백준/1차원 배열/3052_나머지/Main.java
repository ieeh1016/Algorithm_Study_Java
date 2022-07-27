import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int array[] = new int[10];
		
		for(int i=0; i<10; i++) {
			int a = scanner.nextInt();
			int b=a%42;
			array[i]=b;
	}
		int count=0;
		
		for(int i=0; i<10; i++) {
			int cnt=0;
			for(int j=i+1; j<10; j++) {
				if(array[i]==array[j]) {
					cnt++;
				}
			}
			if(cnt==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
