import java.util.Scanner;

public class BaekJoon_10870 {

    public static int Fibonacci(int n){
        if(n == 0) return 0;
        else if(n == 1) return 1;
        else{
            return Fibonacci(n-1) + Fibonacci(n -2);
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        System.out.println(Fibonacci(n));
    }
}
