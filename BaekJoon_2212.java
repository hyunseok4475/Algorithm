import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class BaekJoon_2212 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set s = new HashSet();

        try {
            int num = Integer.parseInt(br.readLine());
            for(int i = 0; i < num; i++){
                s.add(Integer.parseInt(br.readLine()));
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
