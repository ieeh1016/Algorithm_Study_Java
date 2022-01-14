import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=scanner.nextInt();
		int count=0;
		
		for(int i=0; i<a; i++) {
			int b=scanner.nextInt();
			if(b==0) {
				count++;
			}
			else {
				int cnt=0;
				for(int j=1; j<=b; j++) {
					
					if(b%j==0) {
						cnt++;
					}
				}
				if(cnt==2) {
					count++;
				}
			}
		}
		System.out.print(count);
				
	}
}


	
