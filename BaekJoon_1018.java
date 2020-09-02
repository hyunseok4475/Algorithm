import java.io.*;

public class BaekJoon_1018 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] tmp = br.readLine().split(" ");
            int N = Integer.parseInt(tmp[0]);
            int M = Integer.parseInt(tmp[1]);
            String[] chessBoard = new String[N];
            int cnt = 0;
            int min = -1;
            
            for(int i = 0; i < N; i++){
                chessBoard[i] = br.readLine();
            }

            for(int i = 0 ; i < N; i++){
                for(int j = 0 ; j < M; j++){
                    if()
                }
            }

            bw.write(String.valueOf(cnt));
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
