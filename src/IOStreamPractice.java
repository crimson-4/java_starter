import java.io.*;

public class IOStreamPractice {
    public static void main(String [] args){
//        try {
//            FileOutputStream out = new FileOutputStream("output.txt");
//            String data= "konchiwa mina";
//            out.write(data.getBytes());
//            out.close();
//            FileInputStream in= new FileInputStream("output.txt");
//            int ch;
//            while((ch=in.read())!=-1)
//            {
//                System.out.print((char)ch);
//            }
//            in.close();
//            System.out.println();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//
//        try {
//            FileWriter out = new FileWriter("output.txt");
//            String data= "pokemon @000011 raichu \n hola";
//            out.write(data);
//            out.close();
//            FileReader in= new FileReader("output.txt");
//            BufferedReader br= new BufferedReader(new FileReader("output.txt"));
//            int ch;
//            while((ch=in.read())!=-1)
//            {
//                System.out.print((char)ch);
//            }
//            in.close();
//            String line;
//            while((line= br.readLine())!=null)
//            {
//                System.out.println(line+":dd");
//            }
//            br.close();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
        try {

            Fruits f= new Fruits(2,"Light Green","sour,sweet");
            BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("fruits.ser"));
            ObjectOutputStream oos= new ObjectOutputStream(bos);
            oos.writeObject(f);
            oos.close();
            bos.close();
            System.out.println("Object written successfully");

        }catch (Exception e){
            System.out.println(e);
        }
        readObject();
    }
    public  static void readObject(){
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("fruits.ser"));
            ObjectInputStream ois= new ObjectInputStream(bis);
            Fruits f=(Fruits) ois.readObject();
            ois.close();
            bis.close();
            System.out.println(f.color+":"+f.taste+":"+f.quantity);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Fruits implements Serializable{
    int quantity;
    String color;
    String taste;
    Fruits(int quantity,String color,String taste)
    {
        this.quantity=quantity;
        this.color=color;
        this.taste=taste;
    }
}


