import java.util.HashMap;

public class maps2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 1};
HashMap<Integer, Integer> map = new HashMap<>();
int max=0;
for(int i=0;i<arr.length;i++){
    if(map.containsKey(arr[i])){
        max=Math.max(max,i-map.get(arr[i]));

    }
    else{
        map.put(arr[i],i);
    }
}
System.out.println(max);
    }
    
}
