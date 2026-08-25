import java.util.*;

public class Result {

    public static List<Integer> circularPalindromes(String s) {

        int n = s.length();
        List<Integer> result = new ArrayList<>();

        for (int start = 0; start < n; start++) {

            String rotation =
                    s.substring(start) + s.substring(0, start);

            int max = 1;

            for (int i = 0; i < n; i++) {

                int len1 = expand(rotation, i, i);
                int len2 = expand(rotation, i, i + 1);

                max = Math.max(max, Math.max(len1, len2));
            }

            result.add(max);
        }

        return result;
    }

    private static int expand(
            String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
