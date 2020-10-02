import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BaekJoon_11729 {

    public static void move(int n, int start, int to, Num num){
        num.seq.add(start+" "+to);
        num.num++;
    }

    public static void Hanoi(int start, int to, int via, int n, Num num){
        if(n == 1){
            move(1,start, to,num);
        }
        else{
            Hanoi(start, via, to, n-1, num);
            move(n, start, to, num);
            Hanoi(via, to, start, n-1, num);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Num num = new Num(0);
        int n = Integer.parseInt(br.readLine());

        Hanoi(1, 2, 3, n, num);

        for(int i = 0 ; i < num.seq.size(); i++){
            bw.write(num.seq.get(i).toString());
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static class Num{
        int num;
        ArrayList seq = new ArrayList<String>();

        Num(int num){
            this.num = num;
        }
    }
}
