import java.util.Scanner;

public class Fifth {
}

class Person {
    // Fieldlər (instance variables)
    String name;
    int age;

    // Constructor (boş)
    Person() {
    }

    // Non-static metod: scanner ilə məlumatları doldurmaq üçün
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adı daxil edin: ");
        name = scanner.nextLine();
        System.out.print("Yaşı daxil edin: ");
        age = scanner.nextInt();
    }

    // Non-static metod: məlumatları çap etmək üçün
    void printData() {
        System.out.println("Ad: " + name + ", Yaş: " + age);
    }

    // Static metod: salam vermək üçün
    static void greet() {
        System.out.println("Salam! Bu static method-dur.");
    }

    // equals methodunu override edirik
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // eyni objectdirsə true
        if (obj == null || getClass() != obj.getClass()) return false;
        Person other = (Person) obj;
        return age == other.age && name.equals(other.name);
    }
}

// Main class
/* public class Main {
    public static void main(String[] args) {
        // Static method çağırışı
        Person.greet();

        // İlk obyekt
        Person person1 = new Person();
        person1.inputData();

        // İkinci obyekt
        Person person2 = new Person();
        person2.inputData();

        // Çap
        System.out.println("\nPerson 1 məlumatları:");
        person1.printData();

        System.out.println("Person 2 məlumatları:");
        person2.printData();

        // equals test
        if (person1.equals(person2)) {
            System.out.println("\nPerson 1 və Person 2 eyni məlumatlara malikdir.");
        } else {
            System.out.println("\nPerson 1 və Person 2 fərqlidir.");
        }
    }
}*/
