import java.util.Scanner;

public class insertionsort {
    static void insertion(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
          int j=i;
          while(j>0&&arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
          }
        }
    }
    public static void main(String[] args){
       Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }
    insertion(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
    
}
