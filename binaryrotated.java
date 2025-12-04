import java.util.Scanner;

public class binaryrotated {
    // static int sort(int[] arr){
    //     int n=arr.length;
    //     int st=0,end=n-1;
    //     int ans=-1;
    //     while(st<=end){
    //         int mid=st+(end-st)/2;
    //         if(arr[mid]<=arr[n-1]){
    //             ans=mid;
    //             end=mid-1;
    //         }
    //         else{
    //             st=mid+1;
    //         }
    //     }
    //     return ans;
    // }

    // static int sort(int[] arr,int t){
    //     int n=arr.length;
    //     int st=0,end=n-1;
    //     while(st<=end){
    //         int mid=st+(end-st)/2;
    //         if(arr[mid]==t) return mid;
    //         else if(arr[mid]<arr[end]){
    //             if(t>arr[mid]&&t<=arr[end]){
    //             st=mid+1;
    //             }
    //             else{
    //                 end=mid-1;
    //             }
    //         }
    //         else{
    //             if(t>=arr[st]&&t<arr[mid]){
    //                 end=mid-1;
    //             }
    //             else{
    //                 st=mid+1;
    //             }

    //         }
    //     }
    //     return -1;
    // }

   static int sort(int[] arr,int t){
        int n=arr.length;
        int st=0,end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==t) return mid;
            else if(arr[st]==arr[mid]&&arr[mid]==arr[end]){
                st++;
                end--;
            }
            else if(arr[mid]<arr[end]){
                if(t>arr[mid]&&t<=arr[end]){
                st=mid+1;
                } 
                else{
                    end=mid-1;
                }
            }
            else{
                if(t>=arr[st]&&t<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        System.out.println(sort(arr,t));
    }
}
