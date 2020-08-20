import java.util.Scanner;

public class BaekJoon_15596 {

    public static long sum(int[] a){

        long total = 0;

        for(int i = 0; i < a.length; i++){
            total += a[i];
        }

        return total;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        long result = sum(arr);

        System.out.println(result);

    }
}
