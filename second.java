import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        int n;
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }

        }
    }
    System.out.println(arr[1]);

    
    }
}
