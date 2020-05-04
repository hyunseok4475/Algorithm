import java.util.Scanner;

public class BaekJoon_2588 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int f,s,t;

        f = b % 10;
        s = (b / 10) % 10;
        t = b / 100;

        System.out.println(f);
        System.out.println(s);
        System.out.println(t);
    }
}
