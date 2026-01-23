public class Fourth {

    static class Student {
        String name;
        int age;
        String grade;

        Student(String name, int age, String grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public static void infoMessage() {
        }

        void info() {
            System.out.println("Student: " + name + ", Age: " + age + ", Grade: " + grade);
        }
    }

        public static void main(String[] args) {
            // Student obyektləri
            Student student1 = new Student("Ali", 20, "A");
            Student student2 = new Student("Aysel", 19, "B");

            // Çap
            student1.info();
            student2.info();


        }
    }
