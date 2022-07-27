import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a=scanner.nextInt();
		String[] array;
		String c="O";
		int count=0;
		int sum=0;
		
		for(int i=0; i<a; i++) {

			String str = scanner.next();
			array=str.split("");
			for(int j=0; j<array.length; j++) {
				if(array[j].equals(c)) {
					count++;
					sum=sum+count;
				}
				else {
					count=0;
				}
			}
			System.out.println(sum);
			count=0;
			sum=0;
		}
		
		

	}
}
	
