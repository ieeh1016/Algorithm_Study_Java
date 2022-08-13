import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public String solution(String str) {
		String answer = "NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		
		String reverseStr = new StringBuilder(str).reverse().toString();
		if(str.equals(reverseStr)) {
			answer = "YES";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.print(T.solution(str));
	}
}	
