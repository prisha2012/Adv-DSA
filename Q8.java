import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        String str="racecar";
        Deque<Character>deque=new ArrayDeque<>();
        for(char c:str.toCharArray()){
            deque.addLast(c);
        }
            boolean isPalindrome=true;
            while(deque.size()>1){
                if(deque.removeFirst()!=deque.removeLast()){
                    isPalindrome=false;
                    break;
                }
                    
            }
            System.out.println(isPalindrome);
        }
    }

