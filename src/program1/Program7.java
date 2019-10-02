package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        int sum = 0;
        char ch;
        for (int i = 0; i < l; i++) {
            ch = s.charAt(i);
            sum += (int) ch;

        }
        System.out.println(sum);
    }
}
