package ch06;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {}
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
        System.out.println("학생 생성!");
    }
    public String showStudentInfo() {
        return studentNumber + " 학생의 이름은 " + studentName + "이고, 학년은 " + grade + "입니다.";
    }
}
