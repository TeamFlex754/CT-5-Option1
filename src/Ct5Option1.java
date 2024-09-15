import java.util.Scanner;

public class Ct5Option1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create String array for days of week and Int array for daily temps
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] dailyTemp = {72, 78, 84, 81, 74, 69, 70};

        int tempSum = 0;
        int tempAverage;
        String dayOfWeek;
        String week;

        System.out.println("Enter a day of the week to see the weather: (Monday thru Sunday");
        dayOfWeek = scanner.nextLine();

        // For loop to iterate through daysOfWeek, if matched with user input, print the index of dailyTemp
        for (int i = 0; i < daysOfWeek.length; i++) {
            if (dayOfWeek.equalsIgnoreCase(daysOfWeek[i])) {
                System.out.println(dayOfWeek + ": " + dailyTemp[i] + " degrees");
            }
        }

        // Create "week' variable to output list of days of week, temps, and average temp
        System.out.println("Would you like the weekly average temp? (yes/ no)");
        week = scanner.nextLine();

        if (week.equalsIgnoreCase("yes")) {
            for (int i = 0; i < daysOfWeek.length; i++) {
                System.out.println(daysOfWeek[i] + ": " + dailyTemp[i] + " degrees");
            }

            for (int i = 0; i < dailyTemp.length; i++) {
                tempSum += dailyTemp[i];
            }
            tempAverage = tempSum / dailyTemp.length;

            System.out.println("The average temp for the week is: " + tempAverage + " degrees");
        }
    }
}
