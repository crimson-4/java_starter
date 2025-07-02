import  java.io.*;
import java.net.*;
public class EcholSocketServer {
    public  static void main(String [] args) throws  Exception{
        int port=1234;
        ServerSocket serversocket= new ServerSocket(port);
        System.out.println("Server started . Waiting for clinet");

        Socket clientsockt= serversocket.accept();
        System.out.println("Client connected");

        BufferedReader in =new BufferedReader(new InputStreamReader(clientsockt.getInputStream()));
        PrintWriter out= new PrintWriter(clientsockt.getOutputStream());
        String inputline;
        while ((inputline=in.readLine())!=null)
        {
            System.out.println("Recieved from client" +inputline);
            out.println("Echo"+inputline);
            if(inputline.equalsIgnoreCase("exit"))break;
        }

        System.out.println("Closing connection");
        clientsockt.close();
        serversocket.close();
    }

}
