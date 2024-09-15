import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] dailyTemp = {60, 55, 76, 34, 56, 87, 52};
        int tempSum = 0;
        int tempAverage;
        String day;
        String week;

        System.out.println("What day of the week is it? (Monday thru Sunday");
        day = scanner.nextLine();

        for (int i = 0; i < daysOfWeek.length; i++) {
            if (day.equalsIgnoreCase(daysOfWeek[i])) {
                System.out.println(day + ": " + dailyTemp[i]);
            }
        }

        System.out.println("Would you like to see the weekly temp average? (yes/ no)");
        week = scanner.nextLine();

        if (week.equalsIgnoreCase("yes")) {
            for (int i = 0; i < daysOfWeek.length; i++) {
                System.out.println(daysOfWeek[i] + ": " + dailyTemp[i]);
            }
            for (int i = 0; i < dailyTemp.length; i++) {
                tempSum += dailyTemp[i];
            }
            tempAverage = tempSum / dailyTemp.length;
            System.out.println("The average weekly temp is: " + tempAverage);

        }
    }
}
