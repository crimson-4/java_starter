import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class javaNonBlockingClient {
    public static void main(String[] args) throws IOException {
        try (SocketChannel socket = SocketChannel.open(new InetSocketAddress("localhost", 5000))) {
            ByteBuffer buffer = ByteBuffer.wrap("Hello Server\n".getBytes());
            socket.write(buffer);

            buffer.clear();
            socket.read(buffer);

            buffer.flip();
            System.out.println("Received from server: " + new String(buffer.array()).trim());
        }
    }
}
