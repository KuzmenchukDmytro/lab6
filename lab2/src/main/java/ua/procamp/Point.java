package ua.procamp;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    @MyAnnotation(name = "",
            args = "",
            desc = "Встановлює розміщення центру по координаті y"
    )
    private void setY(double y) {
        this.y = y;
    }

    @MyAnnotation(name = "",
            args = "",
            desc = "Встановлює розміщення центру по координаті x"
    )
    private void setX(double x) {
        this.x = x;
    }

    public String toString() {
        return String.format("x = " + x + "; y = " + y);
    }
}
