import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		boolean prime[] = new boolean[b+1];
		
		
		
		prime[0]=true;
		prime[1]=true;
		
		for(int i=2; i<Math.sqrt(prime.length); i++) {
			if(prime[i]==true) {
				continue;
			}
			for(int j=i+i; j<prime.length; j=j+i) {
				prime[j]=true;
			}
		}
		
		for(int i=a; i<=b; i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
		
	}
}



	
