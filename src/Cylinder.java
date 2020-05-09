public class Cylinder extends Circle{
    private double height =5;

    public Cylinder() {

    };

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;

    };

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        double a = super.getArea();
        double b = super.getPerimeter();
        return a * 2 + b * height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder: radius=" + getRadius()
                + " | height=" + getHeight()
                + " | color: " + getColor()
                + " | area: " + this.getArea()
                + " | perimeter: " + getPerimeter()
                + " | volume: " + getVolume();
    }
}
