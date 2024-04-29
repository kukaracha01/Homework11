import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        checkLeapYear(year);
    }
    public static void checkLeapYear(int yearNew) {
        if (yearNew % 4 == 0 && yearNew % 100 != 0 || yearNew % 400 == 0) {
            System.out.println(yearNew + " год является високосным");
            return;
        } else {
            System.out.println(yearNew + " год является не високосным");
            return;
        }
    }


}


