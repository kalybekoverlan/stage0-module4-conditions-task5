package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeapYear;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("leap");
        } else {
            isLeapYear = false;
            System.out.println("not leap");
        }
    }

    public static void main(String[] args) {
        LeapYearPrinter d = new LeapYearPrinter();
        d.isLeapYear(2012);
    }
}
