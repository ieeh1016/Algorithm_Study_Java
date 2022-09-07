import java.util.*;


class Main {
		int[][] pane;
		int di[] = {0,1,0,-1};
		int dj[] = {1,0,-1,0};

		boolean inRange(int i, int j, int n){
			return (0 <= i && i<n) && (0<=j && j<n);
		}
    public int solution(int n) {
        
			pane = new int[n][n];
			int ci =0;
			int cj =0;
			int num = 1;
			int k = 0;
			
			while(inRange(ci,cj,n) && pane[ci][cj]==0){
				pane[ci][cj] = num++;
				int ni = ci + di[k];
				int nj = cj + dj[k];
				if(!inRange(ni,nj,n) || pane[ni][nj] != 0){
					k=(k+1)%4;
					
				}
				ci = ci+di[k];
				cj = cj+dj[k];
			}
			
			int answer = 0;
			for(int a=0; a<n; a++){
				answer = answer + pane[a][a];
			}
			
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}