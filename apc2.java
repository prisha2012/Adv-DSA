interface Vowelcount{
    int vowel(String str);
}
public class apc2 {
    public static void main(String[] args) {
        Vowelcount v=(String name)-> {
            int count=0;
            char ch[]=name.toCharArray();
            for(int i=0;i<name.length();i++){
                if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') count++;

            }
            return count;
        };
        System.out.println(v.vowel("welcome"));
        System.out.println(v.vowel("university"));
    }
}
