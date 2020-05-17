package Lab.Communication;

public class MessageFormer {
    private final String BEGINNER="_MESSAGE_BEGINNING_";
    private final String ENDER = "_MESSAGE_END_";
    boolean hasEnded;
    String message;
    byte[] arr;
    MessageFormer(){
        hasEnded=false;
        message="";
    }
    void formFromByte(byte[] list){
        String es = new String(list);
        message=message.concat(es);
        if(message.contains(BEGINNER))
            message=message.substring(BEGINNER.length());
        if(message.contains(ENDER)){
            message=message.substring(0,message.indexOf(ENDER));
            hasEnded=true;
        }
    }
    public MessageFormer(String line){
        String es = BEGINNER.concat(line).concat(ENDER);
        arr=es.getBytes();
    }
}
