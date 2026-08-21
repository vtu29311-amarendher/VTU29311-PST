class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1970(date1) - daysFrom1970(date2));
    }

    private int daysFrom1970(String dateStr) {
        String[] parts = dateStr.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = day;

        // Add days for all preceding years since 1970
        for (int y = 1970; y < year; ++y) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // Add days for preceding months in current year
        for (int m = 1; m < month; ++m) {
            totalDays += daysInMonth[m];
            if (m == 2 && isLeapYear(year)) {
                totalDays += 1;
            }
        }

        return totalDays;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
