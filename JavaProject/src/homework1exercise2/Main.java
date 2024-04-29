package homework1exercise2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Max Mustermann", 40000);
        Student student = new Student("Lena Test", "Computer Science");
        Professor professor = new Professor("Dirk Müller", 50000, "Software Engineer");
        PhD phD = new PhD("Thomas Schmidt", 30000, "Artificial Intelligence");
        Tutor tutor = new Tutor("Sarah Jung", "Computer Science", "Mathematics");

        System.out.println("Employee: " + employee.getName() + ", Salary: " + employee.getSalary());
        System.out.println("Student: " + student.getName() + ", Subject: " + student.getSubject());
        System.out.println("Professor: " + professor.getName() + ", Salary: " + professor.getSalary() + ", Chair: " + professor.getChair());
        System.out.println("PhD: " + phD.getName() + ", Salary: " + phD.getSalary() + ", Research Topic: " + phD.getResearchTopic());
        System.out.println("Tutor: " + tutor.getName() + ", Subject: " + tutor.getSubject() + ", Teaching Subject: " + tutor.getTeachingSubject());
    }
}