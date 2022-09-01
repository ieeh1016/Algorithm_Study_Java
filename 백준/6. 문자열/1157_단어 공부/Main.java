import java.util.Scanner;


public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String str = scanner.next();
		
		String substr = str.toLowerCase();
		
		char[] aaa = substr.toCharArray();
		
		int arr[] = new int[26];
		
		for(int i=0; i<26; i++) {
			arr[i]=0;
		}
		for(int i=0; i<aaa.length; i++) {
			arr[(int)aaa[i]-'a']++;
		}

        int max = 0;
        char answer = '?';
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                answer = (char)(i+'A');
            } else if (max == arr[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
		
		
	}
}


	
