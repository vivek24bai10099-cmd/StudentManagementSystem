// Class to manage student operationsimport java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void removeStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        System.out.println("Student removed if ID existed.");
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}
