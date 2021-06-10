package module_4.homeWork_4_5.task_5;

import java.util.Scanner;

public class HomeWork_4_5_Task_5
{
    public static final String PLACEHOLDER = "***";

    public static void main(String[] args)
    {
        String cardNumber = getCardNumber();
        String safe = searchAndReplaceDiamonds(cardNumber, PLACEHOLDER);
        System.out.println(safe);

    }

    public static String searchAndReplaceDiamonds(String text, String placeholder)
    {
        String correctStr = text.replaceAll("<+.+?>+", placeholder);

        return correctStr;
    }

    public static String getCardNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер кредитной карты:");
        String inputStr = input.nextLine();
        input.close();

        return inputStr;
    }

}
