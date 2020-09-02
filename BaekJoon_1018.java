import java.io.*;
import java.util.Arrays;

public class BaekJoon_1018 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] tmp = br.readLine().split(" ");
            int N = Integer.parseInt(tmp[0]);
            int M = Integer.parseInt(tmp[1]);
            String[] chessBoard = new String[N];
            int cnt_case1 = 0;
            int cnt_case2 = 0;
            int min = 99999;

            for (int i = 0; i < N; i++) {
                chessBoard[i] = br.readLine();
            }

            for (int i = 0; i <= N - 8; i++) {
                for (int j = 0; j <= M - 8; j++) {
                    for (int k = i; k < i + 8; k++) {
                        for (int l = j; l < j + 8; l++) {
                            if (k % 2 == 0) {
                                if (chessBoard[k].charAt(l) == 'B' && l % 2 == 0) {
                                    cnt_case1++;
                                } else if (chessBoard[k].charAt(l) == 'W' && l % 2 == 0) {
                                    cnt_case2++;
                                } else if (chessBoard[k].charAt(l) == 'B' && l % 2 == 1) {
                                    cnt_case2++;
                                } else if (chessBoard[k].charAt(l) == 'W' && l % 2 == 1) {
                                    cnt_case1++;
                                }
                            } else if (k % 2 == 1) {
                                if (chessBoard[k].charAt(l) == 'B' && l % 2 == 0) {
                                    cnt_case2++;
                                } else if (chessBoard[k].charAt(l) == 'W' && l % 2 == 0) {
                                    cnt_case1++;
                                } else if (chessBoard[k].charAt(l) == 'B' && l % 2 == 1) {
                                    cnt_case1++;
                                } else if (chessBoard[k].charAt(l) == 'W' && l % 2 == 1) {
                                    cnt_case2++;
                                }
                            }
                        }
                    }

                    if (cnt_case1 >= cnt_case2) {
                        if(min >= cnt_case2)
                            min = cnt_case2;
                    }
                    else if(cnt_case2 >= cnt_case1){
                        if(min >= cnt_case1)
                            min = cnt_case1;
                    }

                    cnt_case1 = 0;
                    cnt_case2 = 0;
                }

            }

            bw.write(String.valueOf(min));
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
