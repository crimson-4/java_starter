public class TestAbstractClass {
     public static void main(String[] args) {
        Vehicle v= new CarT();
        v.start();
        v.fuel();
        v=new Bike();
        v.start();
        v.fuel();
    }
}

abstract  class   Vehicle{
    abstract void  start()  ;
    public  void fuel(){
        System.out.println("Fueling Vehicle");
    }
};

class  CarT extends Vehicle{
    @Override
    void start() {
        System.out.println("Car started with key");
    }
}

class  Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike started with kick");
    }
}


