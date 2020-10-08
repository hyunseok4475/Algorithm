import java.util.Scanner;

public class BaekJoon_2475 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int num;
        int sum = 0;
        for(int i = 0; i <5; i++){
            num = stdIn.nextInt();
            sum += Math.pow(num,2);
        }
        System.out.println(sum%10);
    }
}
