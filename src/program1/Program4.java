package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        String s = "";
        int k = 1;
        System.out.println("Enter initial String: ");
        String str = br.readLine();
        char[] c = new char[s.length()];
        c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ((c[i] == 'a') || (c[i] == 'e') || (c[i] == 'i') || (c[i] == 'o') || (c[i] == 'u') || (c[i] == 'A') || (c[i] == 'O') || (c[i] == 'E') ||
                    (c[i] == 'I') || (c[i] == 'U')) {
                if ((count - (3 * i) - k) % 3 == 0) {
                    c[i] = '*';
                    count++;
                    k = 0;
                } else if ((count % 3 != 0) && count % 2 == 0 || (count - 2) % 3 == 0) {
                    c[i] = '^';
                    count++;
                } else if (count % 3 == 0) {
                    c[i] = '!';
                    count++;
                }
                k = 1;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            s += c[i];
        }
        System.out.println(s);
    }
}