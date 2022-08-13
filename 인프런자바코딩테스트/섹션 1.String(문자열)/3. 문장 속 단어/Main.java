import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;

public class Main {

	public String solution(String str) {
		String answer = "";
		
		//split
		int maxStr = 0;
		
		String[] arr = str.split(" ");
		for(String x : arr) {		
			int len = x.length();
			if(len > maxStr) {
				maxStr = len;
				answer = x;
			}
		
		}
		
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main T = new Main(); // T라는 Main의 객체 생성
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.solution(str));
		
	}
}	
