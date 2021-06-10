package module_4.homeWork_4_3.task_1;

public class GeometryCalculator
{
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius)
    {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double isTriangleRightAngled(double a, double b, double c)
    {
        if ((a + b) > c && (a + c) > b && (b + c) > a)
        {
            return 1.0;
        } else
        {
            return -1.0;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c)
    {
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
