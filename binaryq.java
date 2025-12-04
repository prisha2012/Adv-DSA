import java.util.Scanner;

public class binaryq {
    // static int firstocc(int[] arr,int x){
    //     int n=arr.length;
    //     int st=0,end=n-1;
    //     int fo=-1;
    //     while(st<=end){
    //         int mid=st+(end-st)/2;
    //         if(arr[mid]==x){
    //             fo=mid;
    //             st=mid+1;
    //         }
    //         else if(x<arr[mid]){
    //             end=mid-1;
    //         }
    //         else{
    //             st=mid+1;
    //         }
    //     }
    //     return fo;
    // }
    static int sqrt1(int x){
        int st=0,end=x;
        int ans= -1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int value=mid*mid;
            if(value==x){
                return mid;
            }
            else if(value<x){
                ans=mid;
                st=mid+1;
            }
            else{
                =mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println(sqrt1(c));
    }
}
