package HomeWork4;

import HomeWork4.User;

import java.util.Scanner;

class UserInput {
    public static User inputUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);
        return new User(fullName, age, gender);
    }
}
