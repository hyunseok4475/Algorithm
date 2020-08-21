import java.util.Scanner;

public class BeakJoon_1000 {

    static int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args){

        Scanner stdIn = new Scanner(System.in);

        int a, b;

        a = stdIn.nextInt();
        b = stdIn.nextInt();

        System.out.println(sum(a,b));
    }
}
