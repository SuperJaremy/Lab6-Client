package Lab.Communication;

import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;

public class MessageReceiver {
    private ByteBuffer message;
    byte[] thing;
    public String receiveMessage(){
        SocketAddress address = new InetSocketAddress("localhost",8888);
        MessageFormer mf = new MessageFormer();
        thing = new byte[100];
        try {
            DatagramChannel dc = DatagramChannel.open();
           dc.bind(address);
           message=ByteBuffer.wrap(thing);
           while (!mf.hasEnded) {
               message.clear();
               dc.receive(message);
               message.flip();
               mf.formFromByte(thing);
           }
           dc.close();
        }
        catch(IOException e){
            System.out.println("Канал не открылся");
        }
        return mf.message;
    }
}
