import java.util.Arrays;


class Main {
	
   public static void main(String[] args) {
	   
	   int array[] = {88, 50, 38, 100, 90, 100, 99, 65};
	   
	   System.out.println("정렬전 "+Arrays.toString(array));
	   
	   Arrays.sort(array);
	   
	   
	   System.out.print("정렬후 "+Arrays.toString(array));
	   
   }

}