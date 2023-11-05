public class Main {
    public static void main(String[] args) {
        Phone phone= new Samsung(); // shouldn't compile

        phone = new SamsungGalaxy6();

        phone.addContact("1", "phone number", "first name", "last name");

        phone.addContact("2", "second phone number", "second first name", "second last name");

        phone.getFirstContact();

        phone.getLastContact();

// send a message to the first contact from the previously listed
        phone.sendMessage("1", "Hello, how are you?");
// max number of characters - 100

        phone.sendMessage("phone number", "message content");

        phone.getFirstMessage("phone number");

        phone.getSecondMessage("phone number");

// make a call to the second contact from the previously listed

        phone.call("second phone number");

        phone.viewHistory();
    }
}