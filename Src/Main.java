package Src;

// region: Driver Code Starts
import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char c[][] = new char[n][m];

            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    c[i][j] = s[j].charAt(0);
                }
            }
            Solution ob = new Solution();
            int ans[][] = ob.chefAndWells(n, m, c);

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    out.print(ans[i][j] + " ");
                }
                out.println();
            }
        }
        out.close();
    }
}

// endregion: Driver Code Ends


// User function Template for Java
class Solution {
    public int[][] chefAndWells(int n, int m, char c[][]) {
        int[][] output = new int[n][m];

        

        return output;
    }
}