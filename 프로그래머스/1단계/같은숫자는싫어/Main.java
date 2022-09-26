import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(queue.isEmpty()){
                queue.offer(arr[i]);
                stack.push(arr[i]);
            }
            else{
                 if(arr[i] != stack.peek()){
                     queue.offer(arr[i]);
                     stack.push(arr[i]);
                 }
            }
        }
        
        int size = queue.size();
        
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++){
             answer[i] = queue.poll();
        }
        
        return answer;
    }
}