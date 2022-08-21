import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			int c=scanner.nextInt();
			
			int d=a*a;
			int e=b*b;
			int f=c*c;
			if(a==0 && b==0 && c==0) {
				break;
			}
			else {
				if(d==e+f) {
					System.out.println("right");
				}
				else if(e==d+f) {
					System.out.println("right");
				}
				else if(f==d+e) {
					System.out.println("right");
				}
				else {
					System.out.println("wrong");
				}
			}
		}
		
	}
}



	
