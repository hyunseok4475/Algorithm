import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class BaekJoon_1260 {

    public void dfs(int[][] a, boolean[] c, int v, boolean flag) {
        Stack<Integer> stack = new Stack<>();
        int n = a.length;

        stack.push(v);
        c[v] = true;
        System.out.println(v + " ");

        while(!stack.isEmpty()){

            int vv = stack.peek();

            flag = false;

            for (int i = 1; i < n; i++){
                if(a[v][i] == 1 && !c[i]){
                    stack.push(i);
                    System.out.println(i + " ");
                    c[i] = true;
                    flag = true;
                    break;
                }
            }

            if(!flag)
                stack.pop();

        }




    }

    public void bfs(int node, boolean[] visited) {
        if (visited[node]) return;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] tmp = br.readLine().split(" ");
        int N = Integer.parseInt(tmp[0]);
        int M = Integer.parseInt(tmp[1]);
        int start = Integer.parseInt(tmp[2]);
        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[N + 1];

        for (int i = 0; i <= N; i++) {
            a[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            tmp = br.readLine().split(" ");
            a[Integer.parseInt(tmp[0])].add(Integer.parseInt(tmp[1]));
            a[Integer.parseInt(tmp[1])].add(Integer.parseInt(tmp[0]));
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
