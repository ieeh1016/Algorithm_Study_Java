import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //회의의 수
		
		//배열 선언
		int[][] arr = new int[N][2];
		
		//배열 입력
		//[i][0]은 시작시간, [i][1]은 종료시간
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		//0번 인덱스 기준으로 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
		    	return o1[0] - o2[0];
		    }
		});
		
		//1번 인덱스 기준으로 오름차순 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
		    	return o1[1] - o2[1];
		    }
		});
		
		int count = 0;
		int end_time = 0;
		
		//시작 시간이 end_time보다 크거나 같으면 end_time을 그 행의 끝나느 시간으로 두고 count 증가 
		for(int i=0;i<N;i++) {
			if(arr[i][0]>=end_time) {
				end_time = arr[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}