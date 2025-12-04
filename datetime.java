import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class datetime {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    String s=sc.nextLine();
    String e=sc.nextLine();
    int bd=sc.nextInt();

    LocalDate sd=LocalDate.parse(s);
    LocalDate ed=LocalDate.parse(e);

    long days= ChronoUnit.DAYS.between(sd,ed);
    System.out.println(days);

    LocalDate r=sd;

    int added=0;
    while(added<bd){
        r=r.plusDays(1);
        DayOfWeek day=r.getDayOfWeek();

        if(day!=DayOfWeek.SATURDAY&& day!=DayOfWeek.SUNDAY){
            added++;
        }
    }
    System.out.println(r);

   }
}
