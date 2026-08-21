import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Read input lines into the 2D ArrayList
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }
        
        // Process queries
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // 1-based line number
            int y = sc.nextInt(); // 1-based position number
            
            // Adjust for 0-based indexing
            int lineIndex = x - 1;
            int posIndex = y - 1;
            
            if (lineIndex >= 0 && lineIndex < lines.size() && 
                posIndex >= 0 && posIndex < lines.get(lineIndex).size()) {
                System.out.println(lines.get(lineIndex).get(posIndex));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
