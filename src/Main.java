public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int year = 2023;
        checkLeapYear(year);

        System.out.println("Task2");
        int clientDeviceYear = 2016;
        int clientOS = 0;
        checkClientOSAndDeviceYear(clientDeviceYear, clientOS);

        System.out.println("Task3");
        int deliveryDistance = 43;
        checkDeliveryDistance(deliveryDistance);

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

    public static void checkDeliveryDistance(int distance) {
        int days = 1;
        if (distance < 20) {
            System.out.println("Потребуется дней: " + days);
            return;
        }
        if (distance >= 20 && distance <= 60) {
            days = days + 1;
            System.out.println("Потребуется дней: " + days);
            return;
        }
        if (distance > 60 && distance <= 100) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
            return;
        }
    }
}

