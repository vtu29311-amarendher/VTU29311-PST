import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            deque.addLast(num);
            set.add(num);

            if (deque.size() == m) {

                maxUnique = Math.max(maxUnique, set.size());

                int removed = deque.removeFirst();

                // Remove only if it no longer exists in the window
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }

        System.out.println(maxUnique);

        sc.close();
    }
}
