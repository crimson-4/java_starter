import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;
import java.nio.channels.Selector;
public class JavaNioNonBlocking {

    public static  void main(String [] args) throws  Exception{
        Selector selecter= Selector.open();
        ServerSocketChannel serverChannel= ServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress(5000));
        serverChannel.configureBlocking(false);
        serverChannel.register(selecter, SelectionKey.OP_ACCEPT);

        System.out.println("Non-blocking Echo Server started on port 5000");
        while(true){
            selecter.select();
            Set<SelectionKey> selectionKeys=selecter.selectedKeys();
            Iterator<SelectionKey> keyIterator= selectionKeys.iterator();
            while (keyIterator.hasNext())
            {
                SelectionKey key= keyIterator.next();

                if(key.isAcceptable())
                {
                    ServerSocketChannel server=(ServerSocketChannel) key.channel();
                    SocketChannel client=server.accept();
                    client.configureBlocking(false);
                    System.out.println("Client connected"+client.getRemoteAddress());
                    client.register(selecter,SelectionKey.OP_READ);

                }
                if(key.isReadable())
                {
                    SocketChannel client=(SocketChannel) key.channel();
                    ByteBuffer buffer= ByteBuffer.allocate(256);
                    int bytesRead=client.read(buffer);
                    if(bytesRead==-1)
                    {
                        System.out.println("Client disconnected");
                        client.close();
                    }
                    else{
                         buffer.flip();
                         client.write(buffer);
                         System.out.println("echoded message"+ new String(buffer.array(),0,bytesRead).trim());

                    }
                }
                keyIterator.remove();
            }

        }

    }

}
