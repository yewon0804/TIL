package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj10995 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                // 홀수 번째
                for (int j = 1; j <= n; j++) {
                    bw.write("* ");
                }
            } else if (i % 2 == 0) {
                // 짝수 번째
                for (int j = 1; j <= n; j++) {
                    bw.write(" *");
                }
            }
            bw.write("\n");
        }
        bw.flush();
    }
}