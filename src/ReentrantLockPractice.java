import java.util.concurrent.locks.ReentrantLock;

class CounterLock{
    private  int count=0;
    private  final ReentrantLock lock=new ReentrantLock();
    public  void increment(){
        boolean islock= lock.tryLock();
        if(islock){
            try{
                this.count++;
            }
            finally {
                lock.unlock();
            }
        }
    }
    public  int getCount(){
        return  count;
    }
};
public class ReentrantLockPractice  {
    public  static  void main(String []args) throws  Exception{
        CounterLock cl=new CounterLock();
        Thread t1= new Thread(()->{
            for(int i=0;i<=190;i++)
            {
                cl.increment();
            }
        });
        Thread t2= new Thread(()->{
            for(int i=0;i<=20;i++)
                cl.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();;
        System.out.println("Get total count:" +cl.getCount());
    }

}
