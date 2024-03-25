
import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> batman = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1;i>=0;i--){
while(!stack.isEmpty()&&arr[i]>stack.peek()){
    stack.pop();
}
if(stack.isEmpty()){
    batman.put(arr[i],-1);
}
else{
    batman.put(arr[i],stack.peek());
}
stack.push(arr[i]);
}  

int res[]= new int[nums1.length];
for(int i = 0;i<nums1.length;i++){
    res[i]=batman.get(nums1[i]);
}
return res;
}
}
class nextGreaterElement{
    public static void main(String[] args) {
        
    }
}

