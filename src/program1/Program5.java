package program1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter intial String: ");
        String s = br.readLine();
        System.out.print("Enter String to be Replaced: ");
        String strsub = br.readLine();
        System.out.println("Enter Replacement String: ");
        String rep = br.readLine();
        System.out.println(s.replaceAll(strsub, rep));
    }
}
