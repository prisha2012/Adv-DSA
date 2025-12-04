import java.util.*;
public class Qprintpurm {
    public static void printpermutation(String str,String ans,List<String> l){
        if(str.equals("")){
            l.add(ans);
            return;
        }
         for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String ros=str.substring(0,i)+str.substring(i+1);
            printpermutation(ros,ans+ch,l);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        List<String> l=new ArrayList<>();
        printpermutation(str,"",l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}