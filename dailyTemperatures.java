import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[]arr) {
        Stack<Integer>stack = new Stack<Integer>();
        int n = arr.length;
        int res[]= new int[n];
        for(int i = n-1;i>=0;i--){
            int count = 1;
            while(!stack.isEmpty()&&arr[i]>=arr[stack.peek()]){
                stack.pop();
                count++;
            }
            if(stack.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
        
    }
}

class dailyTemperatures{
    public static void main(String[] args) {
        
    }
}