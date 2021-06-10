package module_4.homeWork_4_1.all_basic_tasks;

public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);
        System.out.println(sumDigits(container.count));
        System.out.println();

        container.count = 12345;
        System.out.println(container.count);
        System.out.println(sumDigits(container.count));
        System.out.println();

        container.count = 10;
        System.out.println(container.count);
        System.out.println(sumDigits(container.count));
        System.out.println();

        container.count = 5059191;
        System.out.println(container.count);
        System.out.println(sumDigits(container.count));
        System.out.println();




    }

    public static Integer sumDigits(Integer number)
    {
        //@TODO: write code here
        String numToString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numToString.length(); i++)
        {
            System.out.println(numToString.charAt(i));
            sum += Integer.parseInt(String.valueOf(numToString.charAt(i)));

        }
        System.out.println("---");
        return sum;
    }
}
