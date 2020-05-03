import java.util.Scanner;

public class BaekJoon_8393 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int sum = 0;

        for(int i = 0; i <= a; i++){
            sum = sum + i;
        }

        System.out.print(sum);
    }
}
