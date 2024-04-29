public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int year = 2023;
        checkLeapYear(year);

        System.out.println("Task2");
        int clientDeviceYear = 2016;
        int clientOS = 0;
        checkClientOSAndDeviceYear(clientDeviceYear, clientOS);

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

    public static void checkClientOSAndDeviceYear(int clientDeviceYear, int clientOS) {
        if (clientDeviceYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }

        }
        return;
    }
}

