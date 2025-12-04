import java.util.*;

class TextInfo{
   private String m;
   
   public void setText(String t){
    m=t;
   }
   public String getText(){
    return m;
   }
}
class TextClassifier extends TextInfo{
    public int countVowels(){
        int count = 0;
        String s = getText().toLowerCase();
  for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
     public int countConsonants() {
        int count = 0;
        String s = getText().toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                    count++;
                }
            }
        }
         return count;
    }
     public String classify() {
        int v = countVowels();
        int c = countConsonants();

        if (v > 0 && c == 0) {
            return "Pure Vowel";
        } else if (v > 0 && c > 0) {
            return "Mixed";
        } else {
            return "No Alphabet";
        }
    }

}


public class textanalytics {
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        TextClassifier t = new TextClassifier();
        t.setText(input);

        System.out.println("Vowel Count: " + t.countVowels());
        System.out.println("Consonant Count: " + t.countConsonants());
        System.out.println("Classification: " + t.classify());
    }
}
