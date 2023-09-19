package A;

public class Circle {
    private int id;
    private float radius;
    static final double Pi = 3.14;

    public Circle(float radio) {
        this.radius = radio;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    public double Chuvi() {
        return 2 * Pi * this.radius;
    }
    public double Dientich() {
        return Pi * this.radius;
    }
}


