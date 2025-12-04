import java.util.LinkedList;
import java.util.Queue;

public class negative { 
    public long[] printfirst (long A[], int N, int K){
        long [] res=new long[N-K+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<N;i++){
            if(A[i]<0){
                q.add(i);
            }


        }
        for (int i=0;i<N-K;i++){
            if(q.peek()<i)q.remove();
            if(q.peek()<=i+K-1){
                res[i]=A[q.peek()];

            }
            else res[i]=0;
        }
        return res;
    }
    public static void main(String[] args) {
        
    }
}
