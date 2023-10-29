public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("Abel Ure", 1, new int[]{90, 85, 92});
        Student student2 = new Student("Nkita Derese", 2, new int[]{78, 88, 95});
//greate work
        // Create Teacher objects
        Teacher teacher1 = new Teacher("Mr. Zele", "java");
        Teacher teacher2 = new Teacher("Ms. Ermiyasa", "database");

        // Create College object
        College college = new College("cs College");
//all thsi is good work keep it up
        // Add students and teachers to the college
        college.addStudent(student1);
        college.addStudent(student2);
        college.addTeacher(teacher1);
        college.addTeacher(teacher2);

        // Print college details
        System.out.println("College Name: " + college.getName());

        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName());
            System.out.println("ID: " + student.getId());
            System.out.println("Grades: " + java.util.Arrays.toString(student.getGrades()));
            System.out.println();
        }
//we are doing well
        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println();
        }
    }
}