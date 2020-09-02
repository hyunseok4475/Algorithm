import java.io.*;

public class BaekJoon_1436 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int MovieNumber = Integer.parseInt(br.readLine());
            int cnt = 0;
            int num = 666;
            String tmp;
            int isTrioSix = 0;
            while (true) {
                tmp = String.valueOf(num);
                isTrioSix = 0;
                for (int i = 0; i < tmp.length(); i++) {
                    if (tmp.charAt(i) == '6') {
                        isTrioSix++;
                    } else if (tmp.charAt(i) != '6') {
                        isTrioSix = 0;
                    }
                    if (isTrioSix == 3) {
                        cnt++;
                        break;
                    }
                }
                if(cnt == MovieNumber){
                    break;
                }
                num = num + 1;
            }

            bw.write(String.valueOf(num));

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
