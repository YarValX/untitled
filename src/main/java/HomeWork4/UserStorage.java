package HomeWork4;

import HomeWork4.User;
import HomeWork4.UserInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class UserStorage {
    private ArrayList users;
    private HashMap<Integer, ArrayList> ageIndex;
    private HashMap<String, ArrayList> genderIndex;
    public UserStorage() {
        users = new ArrayList<>();
        ageIndex = new HashMap<>();
        genderIndex = new HashMap<>();
    }

    public void addUser(User user) {
        users.add(user);
        int age = user.getAge();
        if (!ageIndex.containsKey(age)) {
            ageIndex.put(age, new ArrayList<>());
        }
        ageIndex.get(age).add(user);
        String gender = Character.toString(user.getGender());
        if (!genderIndex.containsKey(gender)) {
            genderIndex.put(gender, new ArrayList<>());
        }
        genderIndex.get(gender).add(user);
    }

    public ArrayList<User> sortByAge() {
        ArrayList<User> sortedUsers = new ArrayList<>(users);
        Collections.sort(sortedUsers, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });
        return sortedUsers;
    }

    public ArrayList<User> sortByAgeAndGender() {
        ArrayList<User> sortedUsers = new ArrayList<>(users);
        Collections.sort(sortedUsers, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                int ageCompare = Integer.compare(u1.getAge(), u2.getAge());
                if (ageCompare != 0) {
                    return ageCompare;
                } else {
                    return Character.compare(u1.getGender(), u2.getGender());
                }
            }
        });
        return sortedUsers;
    }
    public void printUsers() {
        for (Object user : users) {
            System.out.println(user);
        }
    }

    public void printSortedUsers() {
        ArrayList<User> sortedUsers = sortByAgeAndGender();
        for (User user : sortedUsers) {
            System.out.println(user);
        }
    }

    public void run() {
        while (true) {
            System.out.print("Enter 1 to add user, 2 to print users, 3 to print sorted users, 4 to exit: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addUser(UserInput.inputUser());
                    break;
                case 2:
                    printUsers();
                    break;
                case 3:
                    printSortedUsers();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}