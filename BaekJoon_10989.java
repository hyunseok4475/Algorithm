import java.io.*;

public class BaekJoon_10989 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int num = Integer.parseInt(br.readLine());
            int get;
            int[] arr = new int[10001];
            for (int i = 0; i < num; i++) {
                get = Integer.parseInt(br.readLine());
                arr[get]++;
            }

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i]; j++)
                    if(arr[i] != 0){
                        bw.write(String.valueOf(i));
                        bw.newLine();
                    }
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
