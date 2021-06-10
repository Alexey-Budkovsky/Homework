package module_4.homeWork_4_5.task_3;

import java.util.Scanner;

public class HomeWork_4_5_Task_3
{
    public static void main(String[] args)
    {
        printFullName();
    }

    public static void printFullName()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите фамилию, затем имя и отчество в одной строке через пробел:");
        String inputStr = input.nextLine();
        input.close();
        if (!inputStr.isBlank())
        {
            String[] fullNameArray = inputStr.split("\\s");
//          System.out.println(Arrays.toString(fullNameArray));
            String surname = fullNameArray[0];
            System.out.printf("Фамилия: %s%n", surname);

            if (fullNameArray.length > 1)
            {
                String name = fullNameArray[1];
                System.out.printf("Имя: %s%n", name);

                if (fullNameArray.length > 2)
                {
                    String patronymic = fullNameArray[2];
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
        {
            System.out.println("Вы ничего не ввели");
        }
    }
}
