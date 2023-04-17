package JavaBasics.ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentGo = new Student(100, "Go");
        studentGo.setKoreaSubject("국어", 100);
        studentGo.setMathSubject("수학", 100);

        studentGo.showScoreInfo();
    }
}
