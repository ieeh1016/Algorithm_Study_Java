import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.print(check(a));
 
		
	}
 
	public static int check(int num) {
		int count = 0;
 
		if (num < 100) {
			return num;
		}
 
		else {
			count = 99;
 
			for (int i = 100; i <= num; i++) {
				int a = i / 100; // ���� �ڸ���
				int b = (i / 10) % 10; // ���� �ڸ���
				int c = i % 10;
 
				if ((a - b) == (b - c)) { // �� �ڸ����� ������ �̷��
					count++;
				}
			}
		}
 
		return count;
	}
 
}


	
