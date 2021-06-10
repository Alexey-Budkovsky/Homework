package module_4.homeWork_4_4.task_4;

import java.util.Scanner;

public class HomeWork_4_4_Task_4
{
    public static final String PLACEHOLDER = " *** ";

    public static void main(String[] args)
    {
        String cardNumber = getCardNumber();
//        System.out.println(cardNumber);

        String safe = searchAndReplaceDiamonds(cardNumber, PLACEHOLDER);
        System.out.println(safe);
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder)
    {
        String firstPart = text.substring(0, text.indexOf("<") - 1);
        String secondPart = text.substring(text.indexOf(">")+2);
        String replacement = firstPart.concat(placeholder).concat(secondPart);
        return replacement;
    }

    public static String getCardNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер кредитной карты:");
        String inputStr = input.nextLine();
        input.close();

        String safePart = inputStr.substring(0, inputStr.lastIndexOf(" "));
        String unsafePart = inputStr.substring(inputStr.lastIndexOf(" "));
        String bothParts = new String("Номер кредитной карты <").concat(safePart).concat(">").concat(unsafePart);

        return bothParts;
    }

}
