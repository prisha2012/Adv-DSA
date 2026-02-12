class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque=new ArrayDeque<Integer>();
        int idx=0,n=nums.length;
        int res[]=new int[n-k+1];
        if(n==0) return res;
        while(idx<k){
            while(!deque.isEmpty()&&nums[deque.peekLast()]<=nums[idx]){
                deque.pollLast();
            }
            deque.offerLast(idx);
            idx++;
        }
        res[0]=nums[deque.peekFirst()];
        for(int i=1;i<n-k+1;i++){
            if(!deque.isEmpty()&&deque.peekFirst()<=(i-1)){
                deque.pollFirst();

            }
                 while(!deque.isEmpty()&&nums[deque.peekLast()]<=nums[i+k-1]){
                deque.pollLast();
            }
            deque.offerLast(i+k-1);
               res[i]=nums[deque.peekFirst()];
        }
        return res;
    }
}
public class 239leetcode {
    
}
