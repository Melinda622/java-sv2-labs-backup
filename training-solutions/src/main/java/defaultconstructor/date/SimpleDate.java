package defaultconstructor.date;

public class SimpleDate {

    private int year;
    private int month;
    private int day;


    public void setDate(int year, int month, int day) {

        if (isCorrect(year, month, day) == false) {
            throw new IllegalArgumentException("One or more given parameter cannot be applied! " + year + ", " + month + ", " + day);
        } else {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900) {
            return false;
        }
        if (month > 12 || month < 1) {
            return false;
        }
        if (calculateMonthLength(year, month) < day) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0;
    }


    public int calculateMonthLength(int year, int month) {
        int length = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                length = 31;
                break;
            case 4, 6, 9, 11:
                length = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    length = 29;
                } else {
                    length = 28;
                }
                break;
        }
        return length;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
