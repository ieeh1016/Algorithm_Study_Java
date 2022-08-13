import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

	public ArrayList<String> solution(int number, String[] arr) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x: arr) {
			StringBuilder str = new StringBuilder(x);
			String reverseStr = str.reverse().toString();
			answer.add(reverseStr);
		}

		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		String[] arr = new String[number];
		for(int i=0; i<number; i++) {
			arr[i] = sc.next();
		}
		for(String x : T.solution(number , arr)) {
			System.out.println(x);
		}
		
		
	}
}	
