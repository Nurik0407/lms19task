import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        Week[] weeks = Week.values();
        DayOfWeek days = null;
        while (true) {
            System.out.println("1 - in the form of numbers  ||   2 - as a string");
            int scan = scanner2.nextInt();
            if (scan == 1) {
                while (true) {
                    System.out.print("Day of week: ");
                    int day = scanner1.nextInt();
                    System.out.println();

                    for (Week week : weeks) {
                        if (DayOfWeek.of(day).name().equals(week.name())) {
                            System.out.println(week.getInfoTranslate());
                            System.out.println();
                        }
                    }
                }
            } else if (scan == 2) {
                while (true) {
                    System.out.print("Day of week: ");
                    String nameOfDay = scanner.nextLine();
                    for (Week week1 : weeks) {
                        if (week1.toString().toLowerCase().equals(nameOfDay.toLowerCase()))
                            System.out.println(week1.getInfoTranslate());
                        System.out.println();

                    }
                }
            } else {
                System.out.println("Invalid command");
            }
        }


    }
}