import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_10817 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int num[] = new int[3];

        for(int i = 0; i <3; i++){
            num[i] = stdIn.nextInt();
        }

        Arrays.sort(num);
        System.out.println(num[1]);
    }
}
