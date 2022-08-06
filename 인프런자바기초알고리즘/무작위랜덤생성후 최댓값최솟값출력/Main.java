import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i]+" ");
		}
		
		int maxNumber=arr[0];
		int minNumber=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(maxNumber < arr[i]) {
				maxNumber = arr[i];
			}
			if(minNumber > arr[i]) {
				minNumber = arr[i];
			}
		}
		System.out.println();
		System.out.println("최댓값은 "+maxNumber);
		System.out.println("최솟값은 "+minNumber);
		
		
		
	}
}	
