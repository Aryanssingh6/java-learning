public class Student {
    // Static variable (shared by all objects)
    static String college = "RCOEM";
    
    // Instance variable (different for each object)
    String name;

    // Constructor
    Student(String n) {
        name = n;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(name + " studies in " + college);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aryan");
        Student s2 = new Student("Rohit");

        s1.display();
        s2.display();

        // Changing college using static method
        Student.changeCollege("IIT Delhi");

        s1.display();
        s2.display();
    }
}
 new {
    
}
