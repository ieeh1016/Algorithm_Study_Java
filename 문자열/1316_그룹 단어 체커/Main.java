import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int count=a;
		for(int i=0; i<a; i++) {
			String str = scanner.next();
			
			boolean test[] = new boolean[26]; //boolean �迭�� �ʱⰪ�� false�̹Ƿ� �̹� üũ�� ���ĺ��� true������ �ٲ�
			
			for(int j=0; j<str.length()-1; j++) {
				if(j<str.length()-1 && str.charAt(j)!=str.charAt(j+1)) {
					if(test[str.charAt(j+1)-97]==true) {
						count--;
						break;
					}
				}
				test[str.charAt(j)-97]=true;
			}
			
		}
		System.out.print(count);
	}
	
}
