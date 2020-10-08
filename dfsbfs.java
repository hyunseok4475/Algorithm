import java.io.*;
import java.util.ArrayList;

public class dfsbfs {

    public void dfs(int[][] graph, boolean[] checked, int node){

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] tmp = br.readLine().split(" ");
        int N = Integer.parseInt(tmp[0]);
        int M = Integer.parseInt(tmp[1]);
        int startNode = Integer.parseInt(tmp[2]);

        ArrayList<Integer>[] graph = new ArrayList[N+1];

        for(int i = 0 ; i < N+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++){
            tmp = br.readLine().split(" ");
            int n = Integer.parseInt(tmp[0]);
            int m = Integer.parseInt(tmp[1]);
            graph[n].add(m);
            graph[m].add(n);
        }

        for(int i = 0 ;i < M; i++){
            System.out.println(graph[i]);
        }
    }
}
