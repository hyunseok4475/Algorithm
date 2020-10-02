import java.io.*;

public class BaekJoon_15649 {

    static int N;
    static int M;
    static int[] arr = new int[10];
    static boolean[] isused = new boolean[10];

    static void func(int k){
        if(k == M){
            for(int i = 0; i < M; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            return;
        }
        for(int i = 1; i <= N; i++){
            if(!isused[i]){
                arr[k] = i;
                isused[i] = true;
                func(k+1);
                isused[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] getInt = br.readLine().split(" ");
        N = Integer.parseInt(getInt[0]);
        M = Integer.parseInt(getInt[1]);
        func(0);

    }
}
