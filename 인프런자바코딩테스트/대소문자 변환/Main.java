import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;


public class Main {

	public String solution(String str) {
		String answer = "";
		
		char[] arr;
		arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if('a'<=arr[i] && 'z'>=arr[i]) {
				arr[i] = (char)(arr[i]-32);
			}
			else {
				arr[i] = (char)(arr[i]+32);
			}
		}
		
	
		answer = String.valueOf(arr);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main T = new Main();
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.next();
		char a = 'c';
		String b = "c";
	
		
		System.out.println(T.solution(str));
		
		scanner.close();
	}
}	
