import java.io.*;
import java.util.Arrays;

class Men implements Comparable<Men> {

    int old;
    int id;
    String name;

    Men(int old, int id, String name) {
        this.old = old;
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Men o) {
        if (this.old > o.old) {
            return 1;
        }
        else if (this.old == o.old) {
            if (this.id > o.id)
                return 1;
            else return -1;
        }
        return -1;
    }
}


public class BaekJoon_10814 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int num = Integer.parseInt(br.readLine());
            Men[] mens = new Men[num];
            String[] tmp;
            for (int i = 0; i < num; i++) {
                tmp = br.readLine().split(" ");
                mens[i] = new Men(Integer.parseInt(tmp[0]), i, tmp[1]);
            }

            Arrays.sort(mens);

            for (int i = 0; i < num; i++) {
                bw.write(mens[i].old + " " + mens[i].name);
                bw.newLine();
            }

            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
