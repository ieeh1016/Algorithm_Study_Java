import java.util.ArrayList;
import java.util.Scanner;


class Main {
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		
		ArrayList<Integer> array = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < n && p2 < m) {
			if(a[p1] > b[p2]) {
				array.add(b[p2++]);
			}
			else {
				array.add(a[p1++]);
			}
		}
		
		while(p1 < n) {
			array.add(a[p1++]);
		}
		while(p2 < m) {
			array.add(b[p2++]);
		}
		
		
		
		return array;
	}
	
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=kb.nextInt();
		}
		int m=kb.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=kb.nextInt();
		}
		for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
	}
}