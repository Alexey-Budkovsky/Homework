package module_4.homeWork_4_3.task_2;

import java.util.Scanner;

public class CountBoxeses
{

    public static final int CONTAINERS = 12;
    public static final int BOXES = 27;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        trucksOrder(num);

    }

    public static void trucksOrder(int number)
    {
        int truckNum = 1;
        int containerNum = 1;


        if (number != 0 && number > 0)
        {
            System.out.printf("Грузовик: %d%n", truckNum);
            System.out.printf("Контейнер: %d%n", containerNum);
            for (int i = 1; i <= number; i++)
            {
                System.out.printf("\tЯщик %d%n", i);
                if (i % (CONTAINERS * BOXES) == 0)
                {
                    truckNum++;
                    System.out.printf("Грузовик: %d%n", truckNum);
                }


                if (i % BOXES == 0)
                {
                    containerNum++;
                    System.out.printf("Контейнер: %d%n", containerNum);
                }
            }
            System.out.println("-----------");
            System.out.printf("Необходимо: %n грузовиков — %d шт. %n контейнеров — %d шт. %n", truckNum,containerNum );
        } else
        {
            System.out.println("Вы неправильно ввели количество ящиков");
        }


    }
}


