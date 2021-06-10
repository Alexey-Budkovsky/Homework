package module_4.homeWork_4_5.task_1;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_4_5_Task_1
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.printf("Сумма заработка: %d%n", salarySum(text));
    }

    public static int salarySum(String text)
    {

        String[] arrStr = text.split("[\\s,-]+");
        System.out.println(Arrays.toString(arrStr));

        int salarySum = 0;

        for (String s : arrStr)
        {
            Scanner scanner = new Scanner(s);
            if (scanner.hasNextInt())
            {
                salarySum += Integer.parseInt(s);
            }
            scanner.close();
        }

        return salarySum;
    }


}
