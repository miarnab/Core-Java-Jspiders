public class Circle {
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "radius: "+radius;
    }
    public static void main(String args[]){
        Circle circle = new Circle(5);
        System.out.println(circle);
    }
}
