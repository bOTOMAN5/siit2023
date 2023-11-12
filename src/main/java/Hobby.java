import java.util.ArrayList;
import java.util.List;
public class Hobby {
    private String name;
    private int frequency;
    private List<Address> addresses;

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public Hobby(String name, int frequency, List<Address> addresses) {
        this.name = name;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
