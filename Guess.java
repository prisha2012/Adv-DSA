// import java.util.Scanner;
// import java.util.Random;

// class Game{
//     public int number;
//     public int numberofguess=0;
//     public int inputnumber;
//     Game(){
//         Random rand=new Random();
//         this.number=rand.nextInt(100);
//     }
//     void userInput(){
//         Scanner sc=new Scanner(System.in);
//         inputnumber=sc.nextInt();
//     }
//     boolean iscorrect(){

//         numberofguess++;
//         if(inputnumber==number){
//             System.out.format("Yes you guessed it right , it was %d\n You guessed it in %d attempt",number,numberofguess);
//             return true;
//         }
//        else if(inputnumber<number){
//             System.out.println("tooo less");
//         }
//         else if(inputnumber>number){
//             System.out.println("too high");
//         }
//         return false;
//     }
//     public int get(){
//         return numberofguess;
//     }
//     public void set(int number){
//         this.numberofguess=number;

//     }
// }


// public class Guess {
//     public static void main(String[] args){
//         Game g=new Game();
//         boolean b=false;
//         while(!b){
//         g.userInput();
//          b=g.iscorrect();
//         System.out.println(b);
//         }
        
//     }
// }
import java.util.Scanner;

import java.util.Random;

class Game1{
    public int number;
    public int numberofguess=0;
    public int Input;

    public Game1(){
        Random r=new Random();
        this.number=r.nextInt(100);
    }
    void userinput(){
        Scanner sc=new Scanner(System.in);
        Input=sc.nextInt();
    }
    boolean iscorrect(){
        numberofguess++;
        if(Input==number){
            System.out.format("ypu got it correct the number was %d\n,no. pf attempts u took %d",number,numberofguess);
            return true;
        }
        else if(Input<number){
            System.out.println("Too less");
        }
        else if(Input>number){
            System.out.println("Too high");
        }
        return false;

    }
    int get(){
        return number;
    }
    void set(){
       this.numberofguess=number;

    }
    

}
public class Guess{
    public static void main(String[] args){
        Game1 g=new Game1();
        boolean b=false;
        while(!b){
            g.userinput();
            b=g.iscorrect();
            System.out.println(b);
        }
    }
}