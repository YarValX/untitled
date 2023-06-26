package HomeWork5;

import java.util.*;

public class PhoneBook {
    private static HashMap<String, HashSet<String>> contacts = new HashMap<>();

    public static void addContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            HashSet<String> phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
        else {
            HashSet<String> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }

    public static void printContacts() {
        List<Map.Entry<String, HashSet<String>>> list = new ArrayList<>(contacts.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, HashSet<String>>>() {
            @Override
            public int compare(Map.Entry<String, HashSet<String>> o1, Map.Entry<String, HashSet<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });

        for (Map.Entry<String, HashSet<String>> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        addContact("Иванов", "123-45-67");
        addContact("Петров", "111-55-66");
        addContact("Иванов", "100-33-22");
        addContact("Волков", "333-44-77");
        addContact("петров", "789-95-47");

        printContacts();
    }
}