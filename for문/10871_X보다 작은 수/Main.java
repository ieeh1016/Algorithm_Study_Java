import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[] array = new int[a];
		for(int i=0; i<a; i++) {
			
			int c = scanner.nextInt();
			if(c<b) {
				array[i]=c;
			}
		}
		for(int i=0; i< array.length; i++) {
			if(array[i]!=0) {
				System.out.print(array[i]+" ");
			}
		}
		
		
		
	}
}
