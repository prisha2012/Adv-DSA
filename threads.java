import java.util.*;
class NumberPrinter extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Number: "+i);
            try {
                Thread.sleep(2000);

            }catch(InterruptedException e){
                System.out.println("Thread Interupted");
            }
        }
    }
}
public class threads {
    public static void main(String[] args) {
        NumberPrinter printer=new NumberPrinter();
        printer.start();
        System.out.println("Main run");
    }
}
