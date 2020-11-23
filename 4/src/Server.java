import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private DatagramSocket socket;
    private DatagramPacket packet;
    private BufferedReader in=null;
    private String str;
    private byte[] buffer;
    private InetAddress address;

    public Server()throws SocketException {
        System.out.println("Отправка сообщений");
        socket=new DatagramSocket();

        transmit();
    }

    private void transmit(){
        in=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Введите строку для передачи клиентам: ");
            try {
                str = in.readLine();
                buffer = str.getBytes();
                address=InetAddress.getByName("233.0.0.1");
                packet = new DatagramPacket(
                        buffer,
                        buffer.length,
                        address,
                        1502
                );
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        try {
            new Server();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}