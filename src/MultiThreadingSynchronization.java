class    Counter{
    int count=0;
    int i=0;
    private  final  Object customLock= new Object();
    public synchronized void  increment(){
        count++;
    }
    public  void  log1(){
        synchronized (this) {
            System.out.println("log: "+i);
            i++;
        }
    }
    public void log2(){
        synchronized (customLock)
        {
            System.out.println("log: "+i);
            i++;
        }
    }

}

public class MultiThreadingSynchronization {

    public  static  void main(String [] args) throws  Exception{
          Counter counter= new Counter();
        Thread t1= new Thread(()->{
            for(int i=0;i<1000;i++)
                counter.increment();
        });

        Thread t2= new Thread(()->{
            for(int i=0;i<1000;i++)
                counter.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();;
        System.out.println("hola :"+counter.count+"what's the output");
        Thread t3= new Thread(counter::log2);
        Thread t4= new Thread(counter::log2);
        for(int i=0;i<100;i++)
        {
            t3.start();
            t4.start();
        }
        
    }
}
