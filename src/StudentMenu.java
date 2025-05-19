import java.util.Scanner;

public class StudentMenu {
    public static void collection() {
        Scanner scanner = new Scanner(System.in);
        StudentManager manage = new StudentManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Student Management Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Find Student by ID");
            System.out.println("5. List All Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int studentID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.println("Enter Age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student Course: ");
                    String course = scanner.nextLine();
                    System.out.println("Enter gpa: ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();

                    StudentDetails newStudent = new StudentDetails(studentID, studentName, age, course, gpa);
                    manage.addStudent(newStudent);
                    System.out.println("Student Added Successfully!");
                    break;
                case 2:
                    System.out.println("Enter Student ID to remove: ");
                    int removeId =  scanner.nextInt();
                    scanner.nextLine();

                    if(manage.removeStudent(removeId)) {
                        System.out.println("Student Removed Successfully!");

                    }
                    else {
                        System.out.println("Student Not Found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter Student ID to update: ");
                    int updateId =  scanner.nextInt();
                    scanner.nextLine();
                    StudentDetails found = manage.findStudentById(updateId);

                    if(found == null) {
                        System.out.println("Student not Found!");
                        break;
                    }
                    System.out.println("Enter Student Name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter Student Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Student Course: ");
                    String newCourse = scanner.nextLine();
                    System.out.println("Enter gpa: ");
                    double newGpa = scanner.nextDouble();
                    scanner.nextLine();
                    StudentDetails updatedStudent = new StudentDetails(updateId, newName, newAge, newCourse, newGpa);
                    manage.updateStudent(updatedStudent);
                    System.out.println("Student Updated Successfully!");
                    break;

                case 4:
                    System.out.println("Enter Student ID to find: ");
                    int findId =  scanner.nextInt();
                    scanner.nextLine();
                    found = manage.findStudentById(findId);
                    if(found != null) {
                        System.out.println(found);
                    }else
                        System.out.println("student not found!");
                    break;

                case 5:
                    manage.listAllStudents();
                    break;

                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");




            }

        }
    }
}
