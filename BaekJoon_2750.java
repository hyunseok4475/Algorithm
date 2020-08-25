import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2750 {

    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }


    static void quickSort(int[] arr, int left, int right) {
        int pl = left;
        int pr = right;
        int x = arr[(pl + pr) / 2];

        do {
            while (arr[pl] < x) pl++;
            while (arr[pr] > x) pr--;
            if (pl <= pr)
                swap(arr, pl++, pr--);
        } while (pl <= pr);

        if(left < pr) quickSort(arr, left, pr);
        if(pl < right) quickSort(arr, pl, right);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = stdIn.nextInt();
        }

        quickSort(nums,0,num-1);

        for (int i = 0; i < num; i++) {
            System.out.println(nums[i]);
        }
    }
}
