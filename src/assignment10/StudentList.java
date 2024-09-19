package assignment10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> studentList=new ArrayList();
    Scanner sc=new Scanner(System.in);
    public void addstudent(Student student) {
        studentList.add(student);
    }
    public Student findStudentByID(String ID) {
        System.out.println("Nhap ID: ");
        for (Student student : studentList) {
            if (student.getId().equals(ID)) {
                return student;
            }
        }
        return null;
    }

    public boolean updateStudentByID(String ID) {
        Student student = findStudentByID(ID);
        if (student != null) {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Nhap ten moi: ");
            String fullname = sc.nextLine();
            student.setFullname(fullname);

            System.out.println("Nhap dateOfBirth moi (dd/MM/yyyy): ");
            String dateOfBirthStr = sc.nextLine();
            try {
                Date dateOfBirth = sdf.parse(dateOfBirthStr);
                student.setDateOfBirth(dateOfBirth);
            } catch (Exception e) {
                System.out.println("Khong hop le dd/MM/yyyy.");
            }

            System.out.println("Nhap GPA moi: ");
            float gpa = sc.nextFloat();
            student.setGpa(gpa);
            sc.nextLine();

            System.out.println("Nhap major moi: ");
            String major = sc.nextLine();
            student.setMajor(major);

            return true;
        } else {
            System.out.println("Khong tim thay ID:  " + ID);
            return false;
        }
    }

    public Student DeleteStudentByID() {
        System.out.println("Nhap ID can xoa: ");
        String ID = sc.nextLine();
        for (Student student : studentList) {
            if (student.getId().equals(ID)) {
                studentList.remove(student);
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : studentList) {
            student.disPlayInfo();
        }
    }

    public void FindHighestGPA() {
        Student top = studentList.get(0);
        for (Student a : studentList) {

            if (a.getGpa() > top.getGpa()) {
                top = a;
            }
        }
        top.disPlayInfo();
    }
}
