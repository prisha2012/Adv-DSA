import java.util.*;
public class postfix {

    public static void main(String[] args) {
        String str="953+4*6/-";
    
    Stack<Integer> val=new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(Character.isDigit(ch)){
            val.push(ch-'0');
        }
        else{
            int val2=val.pop();
            int val1=val.pop();
            int result=0;
            switch(ch){
                case '+':result=val1+val2;break;
                case '-':result=val1-val2;break;
                case '*':result=val1*val2;break;
                case '/':result=val1/val2;break;
                case '^':result=(int)Math.pow(val1,val2);break;
            }
            val.push(result);

        }

    }
    System.out.println(val.peek());
}
}
