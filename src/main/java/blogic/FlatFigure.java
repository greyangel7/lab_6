package blogic;
public class FlatFigure {
    private double a, b, c, d;
    private int al, bet;


    public FlatFigure(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (FFHelp.isTriangle(a, b, c)) {
            System.out.println("ok Triangle");
        } else {
            System.out.println("bad Triangle");
        }
    }

    public FlatFigure(double a, double b, int alfa) {
        this.a = a;
        this.b = b;
        this.al = alfa;
        if (alfa == 90) {
            this.c = Math.sqrt(a * a + b * b); // Прямоугольный треугольник
        } else {
            this.c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(alfa)));
        }
    }

    public FlatFigure(double a, int alfa) {
        this.a = a;
        this.b = a;
        this.c = a;
        this.d = a;
        this.al = alfa;
        this.bet = 180 - alfa;
    }

    public FlatFigure(double a, double b, int alfa, int betta) {
        this.a = a;
        this.b = b;
        this.c = a;
        this.d = b;
        this.al = alfa;
        this.bet = betta;
        if (FFHelp.isParallelogram(a, b, c, d, alfa, betta)) {
            System.out.println("ok Parallelogram");
        } else {
            System.out.println("bad Parallelogram");
        }
    }

    public double area() {
        if (d == 0) { // Треугольник
            return FFHelp.triangleArea(a, b, c, al);
        } else { // Параллелограмм
            return FFHelp.parallelogramArea(a, b, al);
        }
    }
}