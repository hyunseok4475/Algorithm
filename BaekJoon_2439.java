import java.util.Scanner;

public class BaekJoon_2439 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();

        for(int i = 0; i < a; i++){
            for(int j = a - (i+1); j > 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
