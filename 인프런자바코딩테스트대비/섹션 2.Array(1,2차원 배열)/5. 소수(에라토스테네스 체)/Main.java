import java.util.Scanner;

class Main {
	

	public int solution(int number) {
		int answer = 0;
		int[] arr = new int[number+1];
		
		
		for(int i=2; i<=number; i++) {
			if(arr[i] == 0) {
				answer++;
				for(int j=i; j<=number; j=j+i) {
					arr[j] = 1;
				} 
			}
		}

		return answer;
	}
	
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.print(T.solution(number));
	
	}
   
   

}