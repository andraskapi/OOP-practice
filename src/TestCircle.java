public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("The circle has radius of " + c1.getRadius() +
                "and area of " + c1.getArea());

        Circle c2 = new Circle(2);
        System.out.println("The circle has radius of " + c2.getRadius() +
                "and area of " + c2.getArea());
        Circle c3 = new Circle(3,"green");
        System.out.println("The circle has radius of " + c3.getRadius() +
                "and area of " + c3.getArea() + "and color of : " + c3.getColor());
        System.out.println();

        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is : " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is : " + c4.getColor());


    }
}
