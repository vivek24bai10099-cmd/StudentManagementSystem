//  Main menu driven programimport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Save to File");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(id, name, course, marks);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    manager.removeStudent(rid);
                    break;

                case 4:
                    FileHandler.saveToFile(manager.getStudents());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
