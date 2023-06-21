package HomeWork4;

class User {
    private String fullName;
    private int age;
    private char gender;

    public User(String fullName, int age, char gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return fullName + " " + age + " " + gender;
    }
}