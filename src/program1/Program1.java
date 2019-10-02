package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int l = s.length();
        System.out.print("index: ");
        for (int i = 0; i < l; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("chars: ");
        for (int j = 0; j < l; j++) {
            System.out.print(s.charAt(j) + "\t");
        }
    }
}
