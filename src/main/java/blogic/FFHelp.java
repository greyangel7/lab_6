
package blogic;

public class FFHelp {

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static boolean isParallelogram(double a, double b, double c, double d, int al, int bet) {
        return al + bet == 180 && a == c && b == d;
    }

    public static double triangleArea(double a, double b, double c, int al) {
        if (al == 90) {
            return 0.5 * a * b; // Прямоугольный треугольник
        } else {
            double p = (a + b + c) / 2; // Полупериметр
            return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // Формула Герона
        }
    }

    public static double parallelogramArea(double a, double b, int al) {
        return a * b * Math.sin(Math.toRadians(al)); // Площадь параллелограмма
    }
}