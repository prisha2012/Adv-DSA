import java.util.HashMap;
import java.util.Map;

public class maps3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 1};
        HashMap<Integer, Integer> freq = new HashMap<>();
    for(int x : arr) freq.put(x, freq.getOrDefault(x, 0) + 1);
    
int maxFreq = 0, result = Integer.MIN_VALUE;
for(Map.Entry<Integer, Integer> e: freq.entrySet()) {
    if(e.getValue() > maxFreq) {
        maxFreq = e.getValue();
        result = e.getKey();
    } else if(e.getValue() == maxFreq && e.getKey() > result) {
        result = e.getKey();
    }
}
System.out.println(result); // 1
    }
}
