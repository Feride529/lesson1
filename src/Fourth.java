public class Fourth {}
// 1-ci class
class Student {
    String name;
    int age;
    String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void info() {
        System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// 2-ci class
 class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void info() {
        System.out.println("Car: " + brand + " " + model + ", Year: " + year);
    }
}

// 3-cü class
class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void info() {
        System.out.println("Teacher: " + name + ", Subject: " + subject);
    }
}

// Main class
 class Main {
    public static void main(String[] args) {
        // Student obyektləri
        Student student1 = new Student("Ali", 20, "A");
        Student student2 = new Student("Aysel", 19, "B");

        // Car obyektləri
        Car car1 = new Car("BMW", "X5", 2022);
        Car car2 = new Car("Toyota", "Corolla", 2018);

        // Teacher obyektləri
        Teacher teacher1 = new Teacher("Elvin müəllim", "Java");

        // Çap
        student1.info();
        student2.info();

        car1.info();
        car2.info();

        teacher1.info();
    }
}

