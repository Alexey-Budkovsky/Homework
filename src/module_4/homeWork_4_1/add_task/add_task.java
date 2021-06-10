package module_4.homeWork_4_1.add_task;

public class add_task
{
    public static void main(String[] args)
    {
        String string = "No man, for any considerable period, can wear one face to himself and another to the multitude, without finally getting bewildered as to which may be the true.";
        System.out.println(sumDigits(string));
    }

    public static Integer sumDigits(String string)
    {
        char[] characters = string.toCharArray();
        int sum = 0;
        for (Character c : characters)
        {
            sum += Character.charCount(c);
        }

        return sum;
    }
}
