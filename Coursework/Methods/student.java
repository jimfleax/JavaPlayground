package Methods;

public class student {
    static void StudentDetails() {
        String name = "Reetabrata";
        int age = 20;
        String batch = "Uniques 5.0";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Batch: " + batch);
    }
    static void Greet() {
        System.out.println("Hello!!");
    }
    public static void main(String[] args) {
        String name = "Reetabrata";
        System.out.println("Hello " + name);
        Greet();
        StudentDetails();
    }
}