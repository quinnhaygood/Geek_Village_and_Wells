
import java.io.*;

public class Playground {

    public static void main(String args[]) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        String s[] = in.readLine().trim().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        for (String x : s) {

            if (x.isEmpty())
                continue;

            out.println(x.trim() + ".");
        }

        out.println(n);
        out.println(m);

        out.close();
    }

}
