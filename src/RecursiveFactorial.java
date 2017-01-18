/**
 * Created by gabriel on 07/01/2017.
 */
public class RecursiveFactorial {

    public static void main(String[] args){
        System.out.println(factorial(6));
        //tower of honai problem
        move(3, 'A', 'C', 'B');

    }
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void move(int numberOfDiscs, char from, char to, char inter){
        if(numberOfDiscs == 1){
            System.out.println("Moving disc 1 from " + from + " to " + to);
        }else{
            move(numberOfDiscs - 1, from, inter, to);
            System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
            move(numberOfDiscs - 1, inter, to, from);
        }
    }
}
