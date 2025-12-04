interface Sumofdigits{
    int sum(int x);

}
public class apc1 {
    public static void main(String[] args) {
        Sumofdigits s=(int num)-> {
            int result=0,rem;
            while(num!=0){
                rem=num%10;
                result=result+rem;
                num=num/10;
            }
            return result;
        };
        System.out.println(s.sum(423));
        System.out.println(s.sum(984));
    }
}
