/* BMI
 public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //BMI (Body Mass Index)
        // Ceki (kg)
        System.out.print("Ceki (kg): ");
        float weightKg = sc.nextFloat();
        //Boy (sm)
        System.out.print("Boy (sm): ");
        // Type conversion: cm -> m

        int heightCm = sc.nextInt();
        double heightM = heightCm / 100.0;
        double bmi = weightKg / (heightM * heightM);
        String category;
        if (bmi < 18.5) {
            category = "Zeif cekili";
        } else if (bmi < 25) {
            category = "Normal";
        } else if (bmi < 30) {
            category = "Artiq cekili";
        } else {
            category = "Obez";
        }
        System.out.printf("BMI: %.2f (%s)%n", bmi, category);
        sc.close();
    }
}
*/


 /*/// Grade Calculator

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("score (0-100): ");
    int score = sc.nextInt();
    if (score >=0 && score <=100) {
        if (score >= 90) {
            System.out.println("Sizin qiymetiniz: A");
        } else if (score >= 80) {
            System.out.println("Sizin qiymetiniz: B");
        } else if (score >= 70) {
            System.out.println("Sizin qiymetiniz : C");
        } else if (score >= 60) {
            System.out.println("Sizin qiymetiniz : D");
        } else {
            System.out.println("Sizin qiymetiniz : F");
        }
    } else{
        System.out.println("Xeta: Score 0 ile 100 arasnda olmalidir!");
    }

}
*/

/*
Ucbucaq
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("a daxil et: ");
    int a = sc.nextInt();
    System.out.print("b daxil et: ");
    int b = sc.nextInt();
    System.out.print("c daxil et: ");
    int c =sc.nextInt();
    // Üçbucaq şərti
    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            System.out.println("Beraberterefli ucbucaq");
        } else if (a == b || a == c || b == c) {
            System.out.println(" Beraberyanli ucbucaq");
        } else {
            System.out.println(" Muxtelifterefli ucbucaq");
        }
    }else {
        System.out.println("Xeta : Bu tereflerle ucbucaq duzelmir!");
    }

}
*/

/*  fifth nin tapsırığı

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


























