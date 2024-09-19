package assignment10;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {
    float gpa;
    String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        String id = sc.nextLine();
        setId(id);
        System.out.println("Name: ");
        String fullName = sc.nextLine();
        setFullname(fullName);
        
        System.out.println("dateOfBirth: ");
        String date = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        try {
            Date dateOfBirth = sdf.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong format!");
        }
        System.out.println("Gpa: ");
        float gpa = sc.nextFloat();
        setGpa(gpa);
        System.out.println("Major: ");
        String major = sc.nextLine();
        setMajor(major);

    }

    public void disPlayInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Fullname: " + getFullname());
        System.out.println("DateOfBirth: " + getDateOfBirth());
        System.out.println("Gpa: " + getGpa());
        System.out.println("Major: " + getMajor());
        
    }
}
