public class TestPolymorphism {
    public  static  void main(String[] ar)
    {
        Shape s= new Rectangle();
        s.area(3,4);
        s=new Square();
        s.show();
        s=new Circle();
        s.area(3,4);

    }
}

class  Shape{
    void show(){
        System.out.println("This is circle");
    }
 public int area( int l,int w){
     System.out.println("area returned");
     return l*w;
 }
}
class  Rectangle extends Shape {
    void show (){
        System.out.println("This is rectangle");
    }
}

class  Square extends Shape {
    void show (){
        System.out.println("This is square");
    }
}

class  Circle extends Shape{

    public int area(int r1,int r2){
        System.out.println("circle area returned");
        return (int)Math.PI*r1*r2;
    }
    void show (){
        System.out.println("This is circle");
    }
}
