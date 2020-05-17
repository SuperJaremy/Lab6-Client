package Lab.Communication;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.Arrays;

public class MessageSender {
    private ByteBuffer message;
    public MessageSender(MessageFormer mf){
        message=ByteBuffer.wrap(mf.arr);
    }
    public void sendMessage(){
        InetSocketAddress localAddress = new InetSocketAddress("localhost",8888);
        InetSocketAddress targetAddress = new InetSocketAddress("localhost",8989);
        try{
            DatagramChannel dc = DatagramChannel.open();
            ByteBuffer buffer = ByteBuffer.allocate(100);
            buffer.flip();
            dc.send(buffer,targetAddress);
            dc.close();
        }
        catch (IOException e){
            System.out.println("Не удалось соедениться с клиентом");
        }
    }
}
