package exercises.Chapter_10;

public class Shape {
    public void draw(){
        System.out.println("Drawing a shape.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}

class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Main{
    public static void main(String[] args){
        Shape shape1=new Rectangle();
        Shape shape2=new Circle();
        shape1.draw();
        shape2.draw();
    }

}
