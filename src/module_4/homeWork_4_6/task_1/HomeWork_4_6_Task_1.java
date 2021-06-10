package module_4.homeWork_4_6.task_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class HomeWork_4_6_Task_1
{
    public static final int DAY = 3;
    public static final int MONTH = 9;
    public static final int YEAR = 1977;

    public static void main(String[] args)
    {
        printAllBirthdayDates();
    }

    public static void printAllBirthdayDates()
    {
        LocalDate birthday = LocalDate.of(YEAR, MONTH, DAY);
        LocalDate now = LocalDate.now();

        int age = now.getYear() - birthday.getYear();
        System.out.println(age);

        for (int i = 0; i < age; i++)
        {
            LocalDate newBirthdayDate = birthday.withYear(YEAR + i);
            DayOfWeek newBirthdayWeek = newBirthdayDate.getDayOfWeek();

            System.out.printf("%d - %s - %.3s %n", i, newBirthdayDate, newBirthdayWeek);
        }

    }

}
