import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Arrays;

public class Main {

	public String solution(String str) {
		
		String answer = "";
		
		char[] arr = str.toCharArray();
		
		ArrayList list = new ArrayList();

		for(int i = 0; i<str.length(); i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		
		for(int i=0; i<list.size(); i++) {
			answer += list.get(i);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.print(T.solution(str));
	}
}	
