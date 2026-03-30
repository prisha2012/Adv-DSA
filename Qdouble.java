import java.util.*;

public class Qdouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        // double val = n + 0.0066;

        System.out.printf("%.2f\n", n);
        System.out.printf("%.4f\n", n);
        System.out.printf("%.6f\n", n);

        // String s = sc.next();

        // double n = Double.parseDouble(s);
        // System.out.printf("%.2f\n", n + 0.005);
        // char last = s.charAt(s.length() - 1);
        // String intPart = s.split("\\.")[0];
        // char firstDec = s.split("\\.")[1].charAt(0);
        // System.out.println(intPart + "." + firstDec + "" + last + last + last);
        // System.out.println(intPart + "." + firstDec + "" + last + last + last + "00");
    }
}