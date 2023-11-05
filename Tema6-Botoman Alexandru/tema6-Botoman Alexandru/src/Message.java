public class Message {
    private String receiver;
    private String content;

    public Message(String receiver, String content) {
        this.receiver = receiver;
        this.content = content;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getContent() {
        return content;
    }
}
