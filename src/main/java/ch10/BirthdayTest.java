package ch10;

public class BirthdayTest {
    public static void main(String[] args) {
        Birthday date = new Birthday();
        date.setYear(1999);
        date.setMonth(12);
        date.setDay(3);

        date.showDate();
    }
}
