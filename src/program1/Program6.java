package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        System.out.println(s);


    }
}