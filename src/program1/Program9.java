package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char ch;
        int absoluteWeight;
        int UpperWeight = 0;
        int LowerWeight = 0;
        int l = s.length();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 65 && ch <= 91) {
                UpperWeight += (int) ch;
            } else if (ch >= 97 && ch <= 122) {
                LowerWeight += (int) ch;
            }

        }

        absoluteWeight = UpperWeight - LowerWeight;
        System.out.println(Math.abs(absoluteWeight));
    }
}

