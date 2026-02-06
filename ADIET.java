import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ADIET {
    public void print(Node root){
        if(root==null)return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                Node curr=q.poll();
                sum+=curr.data;
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            System.out.println(sum);
        }
    }
        // box stack approach
        int maxSrackHeight(int[] boxHeights, int[] boxWidths,int[] boxDepths, int n){
            List<int[]> boxes=new ArrayList<>();
            for(int i=0;i<n;i++){
                boxes.add(new int[]{boxHeights[i],Math.max(boxWidths[i],boxDepths[i]),Math.min(boxWidths[i],boxDepths[i])});
                boxes.add(new int[]{boxWidths[i],Math.max(boxHeights[i],boxDepths[i]),Math.min(boxHeights[i],boxDepths[i])});
                boxes.add(new int[]{boxDepths[i],Math.max(boxHeights[i],boxWidths[i]),Math.min(boxHeights[i],boxWidths[i])});
            }
            boxes.sort((a,b)->b[1]*b[2]-a[1]*a[2]);
            int[] dp=new int[boxes.size()];
            int ans=0;
            for(int i=0;i<boxes.size();i++){
            dp[i]=boxes.get(i)[0];
                for(int j=0;j<i;j++){
                    if(boxes.get(i)[1]<boxes.get(j)[1] && boxes.get(i)[2]<boxes.get(j)[2]){
                        dp[i]=Math.max(dp[i],dp[j]+boxes.get(i)[0]);
                    }
                }
                ans=Math.max(ans,dp[i]);
            }
            return ans;
        }
        public int mindiff(int[] arr){
            int sum=0;
            for(int x:arr)sum+=x;
            boolean[] dp=new boolean[sum+1];
            dp[0]=true;

            for(int num:arr){
                for(int j=sum;j>=num;j--){
                    dp[j]=dp[j]||dp[j-num];
                
            }
            int diff=Integer.MAX_VALUE;
            for(int s1=0;s1<=sum/2;s1++){
                if(dp[s1]){
                    diff=Math.min(diff,sum-2*s1);
                }
            }
            return diff;
        }
    int minPopulation(int n, int[][] updates) {
        int diff[]=new int[n+2];
        for(int[]:updates){
            int l=u[0],r=u[1],val=u[2];
            diff[l]+=val;
            diff[r+1]-=val;
        }
        int min=Integer.MAX_VALUE;
        int curr=0;
        for(int i=1;i<=n;i++){
            curr+=diff[i];
            min=Math.min(min,curr);
        }
        return min;
    }
    String reaarange(String s){
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.add(new int[]{i,freq[i]});
            }
        }
        StringBuilder sb=new StringBuilder();
        int[] prev={-1,0};
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            sb.append((char)(curr[0]+'a'));
            curr[1]--;
            if(prev[1]>0){
                pq.add(prev);
            }
            prev=curr;
        }
        return sb.length()==s.length()?sb.toString():"";
    }

}
