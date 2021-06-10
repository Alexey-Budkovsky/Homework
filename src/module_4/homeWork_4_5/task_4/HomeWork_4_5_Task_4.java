package module_4.homeWork_4_5.task_4;

import java.util.Scanner;

public class HomeWork_4_5_Task_4
{
    public static void main(String[] args)
    {
        printCorrectPhoneNumber();
    }

    public static void printCorrectPhoneNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите телефонный номер:");
        String inputStr = input.nextLine().replaceAll("[^0-9]", "");
        input.close();

        StringBuilder correctNum = new StringBuilder();
        if (inputStr.length() <= 11 && inputStr.length() > 9)
        {
            if (inputStr.length() == 10)
            {
                correctNum.append("7").append(inputStr);
            } else if (inputStr.startsWith("8"))
            {
                correctNum.append(inputStr).replace(0, 1, "7");
            } else if (inputStr.startsWith("7"))
            {
                correctNum.append(inputStr);
            } else
            {
                System.out.println("Неверный формат номера");
            }
        } else
        {
            System.out.println("Неверный формат номера");
        }

        System.out.println(correctNum);
    }
}
