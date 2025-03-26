package Hw_15;

import java.util.ArrayList;
import java.util.Arrays;


public class Student {
    private String name;
    private String group;
    private int course;
    private int [] grades;

    public Student (String name, String group, int course, int [] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public int [] stGrades(){
        return grades;
    }

    public static boolean CheckGrades(int[] grades){
        float score = ((Arrays.stream(grades).sum()) / (float) grades.length);
        return score >= 3;
    }

    public static void deleteStudents(ArrayList<Student> students){
        int lengthOfStudents = students.size();
        int i = 0;
        while (i < lengthOfStudents){
            if (!Student.CheckGrades(students.get(i).grades) ){
                students.remove(i);
                lengthOfStudents--;
                students.get(i).course++;
            }
            else i++;
        }

    }

    public static void printStudents(ArrayList<Student> students, int course){
        for (Student student : students){
            if (student.course == course){
                System.out.println(student.name+" ");
            }
        }
    }

    public static void studentsList (ArrayList<Student> students){
        for (Student student : students){
            System.out.print(student.name+ " " + student.course + " ");
        }
        System.out.println();
    }
}