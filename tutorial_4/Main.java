package tutorial_4;

public class Main {
    // ... rest of your code
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer(
            "L100",
            "Dr Ahmad",
            "Faculty of Information Technology",
            "Java Programming"
        );

        lecturer.displayInfo();
        lecturer.displaySubject();
    }
}