import java.util.Scanner;

public class recursion {
//    static void inc(int n){
//         if (n==1){
//             System.out.println("1");
//             return;
        
//         }
//         System.out.println(n);
//          inc(n-1);
//     }
// static void fac(int n){

//     if(n==1){
//         System.out.println("1");
//         return;
//     }
//     System.out.print(n+"*");
//     fac(n-1);
// }
// static int fab(int n){
//     if(n==1||n==0){
//         return n;
//     }
//     return fab(n-1)+fab(n-2);
// }

// static int sum(int n){
//     if(n>=0&&n<=9){
//         return n;
//     }
//     return sum(n/10)+n%10;

// }
// static int sum(int n){
//     if(n==0){
//         return 0;
//     }

//     return 1+sum(n/10);

// }
// static int pq(int p,int q){
// if(q==0){
//     return 1;
// }
// return p*pq(p,q-1);

// }

// static int ab(int b){
//     if(b==0){
//         return 0;
//     }
//     if(b%2==0)  return ab(b-1)-b;
//     else return ab(b-1)+b;
// }
 
// static int gcd(int x,int y){
//     if(y==0){
//         return x;
//     }
//     return gcd(y,x%y);
// }
// static void arr(int[] arr,int idx){
//     if(idx==arr.length){
//         return;
//     }
//     System.out.println(arr[idx]);
//     arr(arr,idx+1);
// }
// static void arr(int[] arr,int idx){}
//     static int arr1(int[] arr,int idx){
//     if(idx==arr.length){
//         return arr[idx];
//     }
//     int max=arr1(arr,idx+1);

//    return Math.max(arr[idx],max);

// }

static int arr(int[] arr,int idx){
    if(idx==arr.length){
             return 0;
            }
            int small=arr(arr,idx+1);
            return small+arr[idx];
}



    public static void main(String[] atgs){
        Scanner sc=new Scanner(System.in);
        int []arr1={5,6,7,8};
        int m=sc.nextInt();
      System.out.println( arr(arr1,m));
        
    }
}
