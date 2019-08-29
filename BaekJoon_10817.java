import java.util.Scanner;

public class BaekJoon_10817 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int tmp;
        if(a <= b){
            tmp = a;
            a = b;
            b = tmp;
        }
        if(a <=c){
            tmp = a;
            a = c;
            c = tmp;
        }
        if(b <= c){
            tmp = b;
            b = c;
            c = tmp;
        }

        System.out.print(b);
    }
}
