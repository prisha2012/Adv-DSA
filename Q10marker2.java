import java.util.*;
public class Q10marker2 {
    public static int[] longestConsecutive(int[] nums){
        if(nums.length==0) return new int[]{0,0};
        Set<Integer> numSet=new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        int maxlen=0;
        int freq=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int curr=num;
                int curlen=1;
                while(numSet.contains(curr+1)){
                    curr+=1;
                    curlen+=1;

            }
            if(curlen>maxlen){
                maxlen=curlen;
                freq=1;
            }
            else if(curlen==maxlen){
                freq+=1;
            }
        }
    }
    return new int[]{maxlen,freq};
    }
 public static void main(String[] args) {
        int[] arr1 = {100, 4, 200, 1, 3, 2};
        int[] ans1 = longestConsecutive(arr1);
        System.out.println("Length = " + ans1[0] + ", Frequency = " + ans1[1]); 
        // Length=4, Frequency=1

        int[] arr2 = {1, 2, 3, 10, 11, 12, 20, 21, 22};
        int[] ans2 = longestConsecutive(arr2);
        System.out.println("Length = " + ans2[0] + ", Frequency = " + ans2[1]); 
        // Length=3, Frequency=3
    }   
}
