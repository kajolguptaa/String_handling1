package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char ch;
        int sum = 0;
        int l = s.length();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 65 && ch <= 91) {
                sum += (int) ch;
            }
        }
        System.out.println(sum);
    }
}
