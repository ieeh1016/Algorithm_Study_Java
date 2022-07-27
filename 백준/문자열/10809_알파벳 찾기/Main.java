import java.util.Scanner;


public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int arr[] = new int[26];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=-1;
			
		}
		String str = scanner.next();
		
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			if(arr[s-'a']==-1) {
				arr[s-'a']=i;
			}
		}
		for(int i=0; i<26; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}


	
