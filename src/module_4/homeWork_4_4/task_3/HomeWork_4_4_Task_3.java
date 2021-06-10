package module_4.homeWork_4_4.task_3;

import java.util.Scanner;

public class HomeWork_4_4_Task_3
{
    public static void main(String[] args)
    {
        getFullName();
    }

    public static void getFullName()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите фамилию, затем имя и отчество в одной строке через пробел:");
        String inputStr = input.nextLine() + " ";
        input.close();
        int startingPoint = 0;
        if (!inputStr.isBlank())
        {
            String surname = inputStr.substring(0, inputStr.indexOf(" "));
            System.out.printf("Фамилия: %s%n", surname);

            startingPoint = surname.length();
            if (inputStr.trim().length() > surname.length())
            {
                String name = inputStr.substring(startingPoint + 1);
                name = name.substring(0, name.indexOf(" "));
                System.out.printf("Имя: %s%n", name);

                startingPoint = surname.length() + 1 + name.length();
                if (inputStr.trim().length() > startingPoint)
                {
                    String patronymic = inputStr.substring(inputStr.trim().lastIndexOf(" ")).trim();
                    System.out.printf("Отчество: %s%n", patronymic);
                } else
                {
                    System.out.println("Вы не ввели отчество");
                }
            } else
            {
                System.out.println("Вы не ввели имя и отчество");
            }
        } else
            System.out.println("Вы ничего не ввели");

//        System.out.println(inputStr);
    }


}
