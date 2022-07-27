import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		int a = scanner.nextInt();
		int array[] = new int[a];
		int big=-1000000;
		int small=1000000;
		
		
		for(int i=0; i<array.length; i++) {
			int c = scanner.nextInt();
			array[i]=c;
			
			if(big<array[i]) {
				big=array[i];
			}
			
			if(small>array[i]) {
				small=array[i];
			}
	}
		System.out.print(small+" "+big);
	}
}
