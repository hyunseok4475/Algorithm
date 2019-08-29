import java.util.Scanner;

public class BaekJoon_2438 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();

        for(int i = 0; i < a; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
