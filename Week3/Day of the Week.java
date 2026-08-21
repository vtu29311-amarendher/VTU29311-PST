import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        LocalDate date = LocalDate.of(year, month, day);
        // getDayOfWeek().getValue() returns 1 for Monday through 7 for Sunday
        return days[date.getDayOfWeek().getValue() - 1];
    }
}
