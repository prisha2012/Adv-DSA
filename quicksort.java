import java.util.Scanner;


public class quicksort {

    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partition(int[] arr,int st,int end){
        int pivot=arr[st];
        int cnt=0;
        for(int i=st+1;i<=end;i++){
            if(arr[i]<pivot)cnt++;
        }
        int pi=st+cnt;
        swap(arr,st,pi);
        int i=st, j=end;
        while(i<=pi&&j>pi){
            while(arr[i]<=pivot)i++;
            while(arr[j]>pivot)j--;
            if(i<pi&&j>pi){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pi;
    }
    static void quick(int[] arr,int st, int end){
        if(st>=end)return;
        int pi=partition(arr,st,end);
        quick(arr,st,pi-1);
        quick(arr,pi+1,end);
    }
    static void display(int[] arr){
        for(int val:arr){
            System.out.print(val+" ");
        }
    }


public static void main(){
  Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    
    display(arr);
}
}