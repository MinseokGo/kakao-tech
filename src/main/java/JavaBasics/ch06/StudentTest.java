package JavaBasics.ch06;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student();
        Student studentGo = new Student(12345, "Go", 4);

        System.out.println(studentGo.showStudentInfo());
        System.out.println(studentKim.showStudentInfo());
    }
}
