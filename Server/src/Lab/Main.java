package Lab;

import Lab.Communication.MessageFormer;
import Lab.Communication.MessageReceiver;
import Lab.Communication.MessageSender;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while (true) {
            MessageReceiver mr = new MessageReceiver();
            String line = mr.receiveMessage();
            System.out.println(line);
            MessageSender ms = new MessageSender(new MessageFormer(line));
            ms.sendMessage();
        }
    }
}
