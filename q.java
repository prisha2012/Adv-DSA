import java.util.Scanner;
public class q {
    // static void bb(int[] arr){
    // int n=arr.length;
    // for(int i=0;i<n-1;i++){
    //     for(int j=0;j<n-1-i;j++){
    //         if(arr[j]==0 &arr[j+1]!=0){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }

            
    //     }
    // }
    // }
    static void ss(String [] ss){
        int n=ss.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(ss[j].compareTo(ss[min])<0){
                    min=j;
                }
            }
            String temp=ss[i];
            ss[i]=ss[min];
            ss[min]=temp;
        }
    }
    public static void main(String[] args){
         Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.next();

    }
    ss(arr);
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
