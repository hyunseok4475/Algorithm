import java.util.Scanner;

public class BaekJoon_2884 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int hour = stdIn.nextInt();
        int min = stdIn.nextInt();

        if (min - 45 < 0 ){
            hour--;
            if(hour >= 0){
                min = 60 + (min - 45);
                System.out.printf("%d %d",hour, min );
            }
            else{
                hour = hour + 24;
                min = 60 + (min - 45);
                System.out.printf("%d %d", hour, min);
            }
        }
        else{
            System.out.printf("%d %d",hour, min-45);
        }
    }
}
