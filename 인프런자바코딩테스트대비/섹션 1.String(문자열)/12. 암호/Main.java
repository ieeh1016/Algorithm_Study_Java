import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public String solution(int number , String str) {
		String answer = "";
		for(int i=0; i<number; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			System.out.print((char)num);
			str = str.substring(7);
			
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String str = sc.next();
		System.out.print(T.solution(number, str));

	}
}	
