package ch04;

public class StudentTest {
    public static void main(String[] args) {
        Student studentGo = new Student();  //인스턴스 생성하고 참조변수 studentGo에 할당

        studentGo.studentId = 12345;
        studentGo.setStudentName("Go");
        studentGo.address = "부산";

        studentGo.showStudentInfo();

        Student studentKim = new Student();

        studentKim.studentId = 54321;
        studentKim.studentName = "Kim";
        studentKim.address = "부산";

        studentKim.showStudentInfo();

        System.out.println(studentGo);
        System.out.println(studentKim);
    }
}
