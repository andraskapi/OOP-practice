public class Circle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1;
        color = "red";
    };
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
    public Circle(double radius, String color ){
        this.radius = radius;
        this.color = color;
    }


    public double getArea(){
       return radius * radius * Math.PI;
    }
    public double getRadius(){
        return radius;
    }



    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
}
