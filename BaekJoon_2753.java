import java.util.Scanner;

public class BaekJoon_2753 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();

        if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
