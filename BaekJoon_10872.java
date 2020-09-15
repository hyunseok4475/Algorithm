import java.io.*;

public class BaekJoon_10872 {

    public static int Factorial(int n){
       if(n == 1){
           return 1;
       }
       else{
           return n * Factorial(n-1);
       }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 1;
        for(int i = 1 ; i < N+1; i++){
            answer *= i;
        }

        System.out.println(answer);
    }
}
