import java.util.*;

public class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {

        int current = arr.get(0);
        int maxSub = arr.get(0);

        int maxNon = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {

            int x = arr.get(i);

            current = Math.max(x, current + x);
            maxSub = Math.max(maxSub, current);

            maxNon = Math.max(maxNon, maxNon + Math.max(0, x));
        }

        return Arrays.asList(maxSub, maxNon);
    }
}
