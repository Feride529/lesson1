package studentRegistration;

import studentRegistration.Data;
import studentRegistration.Student;
import studentRegistration.Utility;

import java.util.Scanner;

public class StudentService {

    static Scanner sc = new Scanner(System.in);



    void register() {
        int len = Utility.requireNumber("How many students do you want to register?");
        Data.students = new Student[len];

        for (int i = 0; i < len; i++) {
            System.out.println(i + 1 + ". registration");
            Data.students[i] = fillAndGetStudent();
        }
    }


    void printAll() {
        int i = 1;
        for (Student st : Data.students) {
            System.out.print(i + ". ");
            st.printData();
            i++;
        }
    }


    Student fillAndGetStudent() {
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter surname:");
        String surname = sc.next();
        int age = Utility.requireNumber("Enter age:");
        int group = Utility.requireNumber("Enter group:");
        return new Student(name, surname, age, group);
    }
}