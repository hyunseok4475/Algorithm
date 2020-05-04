import java.util.Scanner;

public class BaekJoon_2523 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        for (i = 0; i < num; i++) {
            for(int j =0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = i - 1; i > 0; i--) {
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
