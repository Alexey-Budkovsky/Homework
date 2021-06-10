package module_4.homeWork_4_2;

public class MaxAndMinValue
{
    public static void main(String[] args) {
        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.format("Максимальное значение byte: %d %nМинимальное значение byte: %d %n",byteMax,byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;

        System.out.format("Максимальное значение short: %d %nМинимальное значение short: %d %n",shortMax,shortMin);

        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        System.out.format("Максимальное значение int: %d %nМинимальное значение int: %d %n",intMax,intMin);

        float floatMax = Float.MAX_VALUE;
        float floatMin = -Float.MAX_VALUE;

        System.out.format("Максимальное значение float: %f %nМинимальное значение float: %f %n",floatMax,floatMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = -Double.MAX_VALUE;

        System.out.format("Максимальное значение double: %f %nМинимальное значение double: %f %n",doubleMax,doubleMin);




    }
}
