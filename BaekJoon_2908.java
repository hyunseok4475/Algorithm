import java.util.Scanner;

public class BaekJoon_2908 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int ra = 0, rb = 0;

        for(int i = 0; i < 3; i++){
            ra += a%10*(int)Math.pow(10,2-i);
            rb += b%10*(int)Math.pow(10,2-i);
            a/=10;
            b/=10;
        }

        if(ra>=rb)
            System.out.println(ra);
        else if(rb>ra)
            System.out.println(rb);
    }
}
