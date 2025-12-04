class Mythread2 implements Runnable{
    public void run(){
        System.out.println("I am a thread2 not a threat");
    }
}
class Mythread3 implements Runnable{
    public void run(){
        System.out.println("I am a thread3 not a threat");
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Mythread2 t1=new Mythread2();
        Thread t3=new Thread(t1);
        Mythread3 t2=new Mythread3();
        Thread t4=new Thread(t2);
        t3.start();
        try{
        t3.join();
        }
        catch(Exception e){
            System.out.println(e);
        }
        t4.start();
    }
}
