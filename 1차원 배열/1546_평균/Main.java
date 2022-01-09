import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a=scanner.nextInt();
		double max=0;
		double sum=0;
		double avg=0;
		
		double array[] = new double[a];
		double array2[] = new double[a];
		
		for(int i=0; i<a; i++) {
			int b=scanner.nextInt();
			array[i]=b;
			if(max<array[i]) {
				max=array[i];
			}
		}
		for(int i=0; i<a; i++) {
			array2[i]=array[i]/max*100;
			sum=sum+array2[i];
		}
		avg=sum/a;
		System.out.println(avg);

	}
}
	
