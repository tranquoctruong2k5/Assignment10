package assignment10;
import java.util.Scanner;
public class prosess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList studentList = new StudentList();
        while(true){
            System.out.println("1. Add a new student\n"+ "2. Update a student by id\n"+ "3. Delete a student by id\n"+ "4. Display all students\n"+ "5. Find the student with the highest GPA\n"+ "6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); 
            
            if (choice == 1) {
                Student student = new Student();
                student.addStudent();
                studentList.addstudent(student);
            } else if (choice == 2) {
                System.out.println("Nhap ID can Update: ");
                String id = sc.nextLine();
                studentList.updateStudentByID(id);
            } else if (choice == 3) {
                studentList.DeleteStudentByID();
            } else if (choice == 4) {
                studentList.displayAllStudents();
            } else if (choice == 5) {
                studentList.FindHighestGPA();
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Chon sai,chon lai.");
            }
        }
}
}
