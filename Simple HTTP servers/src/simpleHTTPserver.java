
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class simpleHTTPserver {
   
    public static void main(String[] args) throws Exception {
        // opening a xerver port 8080
        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening to socket 8080...........");
        while (true) { // This while statement keeps the programme running.
             final Socket client = server.accept();
        }
    
    }
}    
