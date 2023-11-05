import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
abstract class Phone {
    private String color;
    private String material;
    private String IMEI;
    private double batteryLife;
    private Map<String, Contact> contacts = new HashMap<>();
    private List<Message> messages = new ArrayList<>();
    private List<Call> callHistory = new ArrayList<>();
    public Phone(String color, String material) {
        this.color = color;
        this.material = material;
        this.IMEI = generateIMEI();
        this.batteryLife = 24.0;
    }

    public Phone() {

    }


    public void addContact(String contactPosition,String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(contactPosition,phoneNumber, firstName, lastName);
        contacts.put(phoneNumber, contact);
    }


    public Contact getFirstContact() {
        return contacts.get(contacts.keySet().toArray()[0]);
    }


    public Contact getLastContact() {
        String[] keys = contacts.keySet().toArray(new String[0]);
        return contacts.get(keys[keys.length - 1]);
    }


    public void sendMessage(String phoneNumber, String messageContent) {
        if (messageContent.length() > 500) {
            System.out.println("Message exceeds the maximum character limit.");
            return;
        }
        Message message = new Message(phoneNumber, messageContent);
        messages.add(message);
        batteryLife -= 1.0;
    }


    public Message getFirstMessage(String phoneNumber) {
        for (Message message : messages) {
            if (message.getReceiver().equals(phoneNumber)) {
                return message;
            }
        }
        return null;
    }


    public void call(String phoneNumber) {
        Call call = new Call(phoneNumber);
        callHistory.add(call);
        batteryLife -= 2.0;
    }


    public void viewHistory() {
        for (Call call : callHistory) {
            System.out.println(call);
        }
    }


    private String generateIMEI() {
        return String.valueOf(Math.random()).substring(2, 15);
    }

    public void getSecondMessage(String phoneNumber) {
        System.out.println(messages);
    }
}
