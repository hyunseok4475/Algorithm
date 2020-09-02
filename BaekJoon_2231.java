import java.io.*;

public class BaekJoon_2231 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String get = br.readLine();
            int num = Integer.parseInt(get);
            int sum = 0;
            int p = 0;


            for(int i = 0 ; i < num; i++){
                sum = i;
                p = i;
                while(p > 0){
                    sum += (p%10);
                    p /= 10;
                }
                if(sum == num){
                    p = i;
                    break;
                }
            }


            bw.write(String.valueOf(p));
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
