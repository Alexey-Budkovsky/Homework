package module_4.homeWork_4_4.task_1;

public class HomeWork_4_4_Task_1
{
    public static void main(String[] args)
    {
//        Задание №1
//Что нужно сделать
//Распечатайте коды всех букв английского алфавита и сами буквы.

        String alphabetEng = "abcdefghijklmnopqrstXYZxyzABCDEFGHIJKLMNOPQRSTUVW";
        System.out.println("En");
        for (int i = 0; i < alphabetEng.length(); i++)
        {
            System.out.printf("%s — %d %n", alphabetEng.charAt(i), alphabetEng.codePointAt(i));
        }

        System.out.println();

        String alphabetRus = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        System.out.println("Ru");
        for (int i = 0; i < alphabetRus.length(); i++)
        {
            System.out.printf("%s — %d %n", alphabetRus.charAt(i), alphabetRus.codePointAt(i));
        }

        System.out.println();

    }
}
