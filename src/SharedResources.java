public class SharedResources {

    public static  void main(String [] args){
        Kitchen kit= new Kitchen();
        ConsumeTask ct=new ConsumeTask(kit);
        ProduceTask pt=new ProduceTask(kit);
        Thread t1= new Thread(ct);
        Thread t2=new Thread(pt);
        t1.start();
        t2.start();

    }
}

class  Kitchen{
    private  boolean isAvailable=false;
    public  synchronized void cook(){
        while (!isAvailable) {
            try {
                System.out.println("cook:waiting for ingred" + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("cook got the ingredient");
    }

    public synchronized void deliverIng(){
        System.out.println("Supplied the material");
        isAvailable=true;
        notify();
    }


}

class ConsumeTask implements  Runnable{
    private  final Kitchen kit;
    public  ConsumeTask(Kitchen kit){
        this.kit=kit;
    }
    @Override
    public void run(){
        kit.cook();
    }
}
class  ProduceTask implements Runnable{
    private  final  Kitchen kit;
    public  ProduceTask(Kitchen kit)
    {
        this.kit=kit;
    }
    @Override
    public  void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        kit.deliverIng();
    }

}