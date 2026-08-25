public class Result {

    public static int marsExploration(String s) {

        String pattern = "SOS";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != pattern.charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }
}
