import java.util.Scanner;

public class Sixth {
}
import java.util.Scanner;

class Person {
    String name;
    int age;

    // Boş constructor
    Person() {
    }

    // Scanner ilə məlumatları dolduran non-static metod
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adı daxil edin: ");
        name = scanner.nextLine();
        System.out.print("Yaşı daxil edin: ");
        age = scanner.nextInt();
        scanner.nextLine(); // nextLine problemi üçün
    }

    // Obyekt məlumatlarını çap edən non-static metod
    void printData() {
        System.out.println("Ad: " + name + ", Yaş: " + age);
    }

    // equals metodunu override edirik
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }

    // Static metod
    static void greet() {
        System.out.println("Salam! Bu static method-dur.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Static metod çağırışı
        Person.greet();

        // 1 ölçülü array yaradılır (2 element)
        Person[] people = new Person[2];

        // Array-in hər elementinə Person obyektini scanner ilə doldurmaq
        for (int i = 0; i < people.length; i++) {
            System.out.println("\nPerson " + (i + 1) + " məlumatlarını daxil edin:");
            people[i] = new Person();
            people[i].inputData();
        }

        // Array-i dövr ilə çap etmək
        System.out.println("\nArray içindəki Person obyektləri:");
        for (int i = 0; i < people.length; i++) {
            System.out.print("Person " + (i + 1) + ": ");
            people[i].printData();
        }

        // Array içindəki obyektləri bir-biri ilə müqayisə etmək (opsional)
        if (people[0].equals(people[1])) {
            System.out.println("\nPerson 1 və Person 2 eyni məlumatlara malikdir.");
        } else {
            System.out.println("\nPerson 1 və Person 2 fərqlidir.");
        }
    }
}
