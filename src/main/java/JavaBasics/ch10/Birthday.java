package JavaBasics.ch10;

public class Birthday {
    private int day;    //int 디폴트 값 0
    private int month;
    private int year;
    private boolean isValid;    //boolean 디폴트 값 false
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if(isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        } else {
            System.out.println("유효하지 않은 날짜");
        }
    }

}
