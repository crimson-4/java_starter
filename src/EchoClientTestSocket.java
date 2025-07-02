import  java.io.*;
import java.net.*;

public class EchoClientTestSocket {

    public  static  void main(String [] args) throws Exception{

        Socket socket= new Socket("localhost",1234);
        System.out.println("Connectd to server");
        BufferedReader in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader userInput= new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input=userInput.readLine())!=null)
        {
            out.println(input);
            String response= in.readLine();
            System.out.println("Server replied" + response);
            if(input.equalsIgnoreCase("exit"))break;
        }
        socket.close();
    }

}
