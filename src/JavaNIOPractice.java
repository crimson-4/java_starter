import  java.io.*;
import  java.nio.*;
import java.nio.channels.*;
import  java.nio.file.*;
public class JavaNIOPractice {
    public  static  void main(String [] args) throws Exception
    {
        FileOutputStream fos =new FileOutputStream("demo.txt");
        FileChannel writechannel= fos.getChannel();
        ByteBuffer outbuf= ByteBuffer.allocate(1020);
        System.out.println("Entering text writing it using channel".getBytes());
        outbuf.put("Entering text writing it using channel".getBytes());
        outbuf.flip();
        writechannel.write(outbuf);
        FileInputStream fis= new FileInputStream("demo.txt");
        FileChannel channel=fis.getChannel();

        ByteBuffer buffer=ByteBuffer.allocate(2048);
        channel.read(buffer);
        buffer.flip();
        while (buffer.hasRemaining()){
            System.out.print((char)buffer.get());
        }
        fis.close();
    }
}
