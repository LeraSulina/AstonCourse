package Hw_15;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Student Victor = new Student("Виктор", "Э-1", 1, new int[] {4, 5, 4, 3, 5});
        Student Anton = new Student("Антон", "Ю-1", 1, new int[] {3, 5, 4, 5, 3});
        Student Veronika = new Student("Вероника", "М-3", 3, new int[] {4, 3, 4, 3, 5});
        Student Angela = new Student("Анжела", "М-4", 4, new int[] {3, 4, 5, 2, 3});
        Student Konstantin = new Student("Константин", "Э-1", 1, new int[] {2, 2, 2, 2, 2});
        Student Vika = new Student("Вика", "Ю-1", 1, new int[] {2, 2, 2, 2, 2});
        Student Kirill = new Student("Кирилл", "М-4",4, new int[] {4, 3, 5, 2, 2});
        ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Victor, Anton, Veronika, Angela, Konstantin, Vika, Kirill));

        Student.printStudents(studentsList, 1);

        System.out.println("----------");

        Student.studentsList(studentsList);
        Student.deleteStudents(studentsList);
        Student.studentsList(studentsList);

        System.out.println("-----------");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Петров", "+7 911 222 11 11");
        phoneBook.addContact("Сидоров", "+7 922 333 22 11");
        phoneBook.addContact("Иванов", "+7 933 444 33 22");
        phoneBook.addContact("Петров", "+7 944 555 77 88");
        phoneBook.addContact("Киров", "+7 999 111 66 55");

        phoneBook.getContact("Петров");
    }

}
