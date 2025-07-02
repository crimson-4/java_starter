public class LambdaFnCLass {
    public  static void main(String [] args)
    {
        MathOps atn=(a,b)->a+2*b;
         MathOps stn=(a,b)->a-b;
         MathOps mtn=(a,b)->a*b;
         MathOps dtn=(a,b)->a/b;

         System.out.println("check sum"+atn.ops(5,4));
        System.out.println("check sum"+stn.ops(5,4));
        System.out.println("check sum"+mtn.ops(5,4));
        System.out.println("check sum"+dtn.ops(16,4));
    }
}
@FunctionalInterface
interface  MathOps{
    int ops(int a,int b);
}

