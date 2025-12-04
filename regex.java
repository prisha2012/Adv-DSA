import java.util.regex.*;
public class regex {
public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\bJ\\w+ ");  // Words starting with 'J'
        Matcher matcher = pattern.matcher("Java is fun, and so is JavaScript!");

        while (matcher.find()) {
            System.out.println("Word found: " + matcher.group());
        }
    }
}


// \\d+ matches one or more digits (e.g., 25, 30).
//  matcher.group() returns the matched number.


