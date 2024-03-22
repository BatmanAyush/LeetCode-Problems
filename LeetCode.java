import java.util.*;

class Solution {
    public static int[] nextSmalltoLeft(int[]arr){
      int n =  arr.length;
      int[] res= new int[n];
      Stack<Integer> stack = new Stack<>();
      for(int i = 0;i<n;i++){
          while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]){
              stack.pop();
          }
          if(stack.isEmpty()){
              res[i]=-1;
          }
          else{
              res[i]=stack.peek();
      
          }
          stack.push(i);
      }
   return res;
    }
    public static int[] nextSmalltoRight(int[]arr){
      int n = arr.length;
      int[] res= new int[n];
      Stack<Integer> stack = new Stack<>();
    for(int i = n-1;i>=0;i--){
        while(!stack.isEmpty()&&arr[i]<=arr[stack.peek()]){
            stack.pop();
        }
        
        if(stack.isEmpty()){
            res[i]=n;
        }
        else{
            res[i]=stack.peek();
    
        }
        stack.push(i);
    }
 return res;
    }
    public int largestRectangleArea(int[] heights) {
      int n = heights.length;
 int[] batman =  Solution.nextSmalltoRight(heights);
 
 int[] wayne= Solution.nextSmalltoLeft(heights);
 
 int maxArea = 0;
 for(int i = 0;i<n;i++){
  int width = batman[i] - wayne[i] - 1;
  int area = width * heights[i];
  maxArea = Math.max(maxArea, area);
 }
return maxArea; 
    }
}

 


  


public class LeetCode {
    public static void main(String[] args) {
        Solution a = new Solution();
        int[] arr = {73,74,75,71,69,72,76,73};
       System.out.println(a.dailyTemperatures(arr));
    }
}
