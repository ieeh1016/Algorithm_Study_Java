import java.util.Arrays;
import java.util.Collections;


class Main {
	
   public static void main(String[] args) {
	   
	   Integer array[] = {88, 50, 38, 100, 90, 99, 74 ,65};
	   
	   System.out.println("정렬전 "+Arrays.toString(array));
	   
	   Arrays.sort(array, Collections.reverseOrder());
	   
	   System.out.println("정렬후 "+Arrays.toString(array));
	   
	   
   }

}