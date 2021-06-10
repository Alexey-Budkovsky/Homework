package module_4.homeWork_4_5.task_2;

import java.util.regex.Pattern;

public class HomeWork_4_5_Task_2
{
    public static void main(String[] args)
    {
        StringBuilder engText = new StringBuilder("NASA traces source of mysterious fast radio bursts sending signals to Earth\n\n");
        engText.append("Don't panic, but mysterious sources have been sending radio signals to Earth for years. Now, scientists have tracked down some of their origins — and they were surprised by what they found.\n");
        engText.append("And no, it's still not aliens.  \n");
        engText.append("Using NASA's Hubble Space Telescope, astronomers have traced the locations of five deep space signals known as fast radio bursts (FRBs). In a thousandth of a second, these powerful blasts generate as much energy as the sun does in an entire year. \n");
        engText.append("Around 1,000 FRBs have been detected since the first one was discovered in 2001, but they are notoriously difficult to track because they disappear in an instant and without a trace. Only 15 of them have been tracked to specific galaxies.\n");

//        System.out.println(engText);

        String text = new String(engText).replaceAll(",","" );
        Pattern pattern = Pattern.compile("[.,:;()?!\"\\s–—]+");

        String[] allEngWords = text.split(String.valueOf(pattern));
        for (String s : allEngWords)
        {
            System.out.printf(" %s%n", s);
        }

    }
}
