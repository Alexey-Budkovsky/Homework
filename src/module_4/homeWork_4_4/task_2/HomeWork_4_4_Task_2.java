package module_4.homeWork_4_4.task_2;

public class HomeWork_4_4_Task_2
{
    public static final String NAME_VASYA = "Вася", NAME_PETYA = "Петя", NAME_MASHA = "Маша";

    public static void main(String[] args)
    {

        //      Задание №2
//Что нужно сделать
//Напишите код в проекте StringExperiments,
// который считает сумму заработка всех друзей (Васи, Пети и Маши).
// Используйте методы indexOf(), lastIndexOf(), substring() и trim().

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.printf("Сумма заработка: %d%n", salarySum(text));

    }

    public static int salarySum(String str) //      Задание №2
    {
        int salarySum = 0;
        String tempStr = "";
        String[] names = {NAME_VASYA, NAME_PETYA, NAME_MASHA};
        for (String s : names)
        {
            tempStr = str.substring(str.indexOf(s), str.indexOf(" руб", str.indexOf(s)));
            salarySum += Integer.parseInt(tempStr.substring(tempStr.lastIndexOf(" "), tempStr.length()).trim());

            System.out.printf("%s: %d%n", s, salarySum);
        }

        return salarySum;
    }
}
