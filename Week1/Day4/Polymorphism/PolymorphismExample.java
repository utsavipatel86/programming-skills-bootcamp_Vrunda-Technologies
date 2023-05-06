package Week1.Day4.Polymorphism;
 class Area{
    public void shapeArea(int length){//to calculate area of square
            System.out.println("Square area : "+length*length);
    }
    public void shapeArea(double radius){//to calculate area of circle
            System.out.println("Circle area : "+(3.14*radius*radius));
    }
 }

public class PolymorphismExample {
    
    public static void main(String[] args) {
        Area a=new Area();
        a.shapeArea(10);//Square
        a.shapeArea(10.0);//Circle
    }
}
