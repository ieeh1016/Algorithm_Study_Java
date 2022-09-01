import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//StringTokenizer은 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스이다.
		
		String str = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		System.out.println(st.countTokens());
		
		scanner.close();
	}

}
