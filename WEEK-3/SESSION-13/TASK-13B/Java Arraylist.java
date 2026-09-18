import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<List<Integer>> lines = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x >= 1 && x <= lines.size()) {
                List<Integer> line = lines.get(x - 1);
                if (y >= 1 && y <= line.size()) {
                    System.out.println(line.get(y - 1));
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
