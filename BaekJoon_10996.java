import java.util.Scanner;

public class BaekJoon_10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        char arr[] = new char[num * 2];

        if(num == 1) System.out.print("*");
        else{
            for(int i = 0; i < num*2; i++){
                for(int j = 0; j < num; j++){
                    if(i%2 == 0 && j%2 == 0){
                        System.out.print("*");
                    }
                    else if(i%2 == 0 && j%2 == 1){
                        System.out.print(" ");
                    }
                    else if(i%2 == 1 && j%2 == 0){
                        System.out.print(" ");
                    }
                    else if(i%2 == 1 && j%2 == 1){
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }

    }
}
