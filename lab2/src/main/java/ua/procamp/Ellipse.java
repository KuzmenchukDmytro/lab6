package ua.procamp;

public class Ellipse extends Point {
    double a;
    double b;

    public Ellipse(double x, double y, double a, double b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @MyAnnotation(name = "переміщення",
            args = "newX - нове значення центру по координаті x, newY - нове значення центру по координаті y",
            desc = "Змінює розміщення еліпсу"
    )
    public void moving(double newX, double newY){
        x = newX;
        y = newY;
    }

    @Override
    public String toString() {
        return String.format("x = " + x + "; y = " + y + "; a = " + a + "; b = " + b);
    }
}
