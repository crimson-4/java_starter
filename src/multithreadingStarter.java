

class EvenThread implements  Runnable{

    public void run(){
        for(int i=2;i<=10;i+=2)
        {     System.out.println(i);
        try{
            Thread.sleep(100);
        }
        catch(Exception e){
         System.out.println("even"+e);
        }
    }
    }
}

class OddThread implements  Runnable{

    public void run(){
        for(int i=1;i<=10;i+=2)
        { System.out.println(i);
            try{Thread.sleep(100);}
            catch (Exception e){
                System.out.println("odd"+e);
            }
        }
    }
}


public class multithreadingStarter {


    public  static  void main(String [] args){

        Thread t1= new Thread(new EvenThread());
        Thread t2= new Thread(new OddThread());
        t1.start();
        t2.start();
    }

}
