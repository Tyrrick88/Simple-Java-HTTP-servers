import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class httpResponse {
    public static void main(String[] args) throws Exception {

        final ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for port 8080.......");

        while(true) {
            try(Socket socket = server.accept());
            Date today = new date();
            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
            socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));

        }




    }

}
 