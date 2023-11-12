import java.util.*;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> nameComparator = new NameComparator();
        Set<Person> peopleByName = new TreeSet<>(nameComparator);

        Comparator<Person> ageComparator = new AgeComparator();
        Set<Person> peopleByAge = new TreeSet<>(ageComparator);

        Map<Person, List<Hobby>> personHobbiesMap = new HashMap<>();

        Person person1 = new Person("Alex", 26 );
        Person person2 = new Person("Alina", 25);

        List<Hobby> hobbies1 = new ArrayList<>();
        List<Hobby> hobbies2 = new ArrayList<>();

        Hobby hobby1 = new Hobby("Cycling", 3);
        Hobby hobby2 = new Hobby("Swimming", 2);

        Address address1 = new Address("Drum Forestier", "Fundata",  "Romania");
        Address address2 = new Address("Sala Sporturilor", "Brasov",  "Romania");
        hobby1.addAddress(address1);
        hobby2.addAddress(address2);

        hobbies1.add(hobby1);
        hobbies2.add(hobby2);

        personHobbiesMap.put(person1, hobbies1);
        personHobbiesMap.put(person2, hobbies2);

        peopleByName.add(person1);
        peopleByName.add(person2);
        peopleByAge.add(person1);
        peopleByAge.add(person2);


        System.out.println("People by name:");
        for (Person person : peopleByName) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }

        System.out.println("People by age:");
        for (Person person : peopleByAge) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }


        Person alex = new Person("Alex", 26);
        List<Hobby> alexHobbies = personHobbiesMap.get(alex);
        if (alexHobbies != null) {
            System.out.println("Hobbies for Alex:");
            for (Hobby hobby : alexHobbies) {
                System.out.println("Hobby: " + hobby.getName());
                List<Address> addresses = hobby.getAddresses();
                System.out.println("Addresses where it can be practiced:");
                for (Address address : addresses) {
                    System.out.println("   " + address.getStreet() + ", " + address.getCity() +  ", " + address.getCountry());
                }
            }
        }
    }
}