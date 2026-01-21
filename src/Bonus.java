import java.util.Scanner;

public class Bonus {
}

// Student class
class Student {
    String name;
    int age;
    String grade;

    // Boş constructor
    Student() {
    }

    // Scanner ilə məlumat doldurmaq
    void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adı daxil edin: ");
        name = scanner.nextLine();
        System.out.print("Yaşı daxil edin: ");
        age = scanner.nextInt();
        scanner.nextLine(); // nextLine problemi üçün
        System.out.print("Qiymətini daxil edin: ");
        grade = scanner.nextLine();
    }

    // Məlumatları çap etmək
    void printData() {
        System.out.println("Ad: " + name + ", Yaş: " + age + ", Qiymət: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = null; // Array əvvəlcə boşdur
        boolean running = true;

        while (running) {
            // Menu göstər
            System.out.println("\n===== MENU =====");
            System.out.println("1. Qeydiyyat");
            System.out.println("2. Hamısını göstər");
            System.out.println("0. Çıxış");
            System.out.print("Seçiminizi edin: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Scanner problemi üçün

            switch (choice) {
                case 1:
                    // Qeydiyyat
                    System.out.print("Neçə nəfər qeydiyyatdan keçəcək? ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    students = new Student[n]; // Dinamik array yaradılır

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nStudent " + (i + 1) + " məlumatlarını daxil edin:");
                        students[i] = new Student();
                        students[i].inputData();
                    }
                    System.out.println("\nQeydiyyat bitdi!");
                    break;

                case 2:
                    // Hamısını göstər
                    if (students == null) {
                        System.out.println("Hələ heç kim qeydiyyatdan keçməyib!");
                    } else {
                        System.out.println("\n===== Qeydiyyatdan keçmiş tələbələr =====");
                        for (int i = 0; i < students.length; i++) {
                            System.out.print("Student " + (i + 1) + ": ");
                            students[i].printData();
                        }
                    }
                    break;

                case 0:
                    // Çıxış
                    System.out.println("Proqramdan çıxılır...");
                    running = false;
                    break;

                default:
                    System.out.println("Yanlış seçim! Yenidən cəhd edin.");
            }
        }

        scanner.close();
    }
}
