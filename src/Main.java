public class Main {


    public static void main(String[] args) {

        System.out.println("Задание №1");
        printInLeapYear(2021);
        System.out.println("Задание №2");
        printValidOSInfo(1, 2015);
        System.out.println("Задание №3");
        calculateDeliveryDays(95);


    }

    public static void printInLeapYear(int year) {
        if (year >= 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void printValidOSInfo(int type, int year) {
        if (type == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (type == 1 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (type == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calculateDeliveryDays(int distance) {
        int days = 0;
        if (distance >= 0 && distance <= 100) {
            if (distance <= 20) {
                days = 1;
            } else if (distance > 20 && distance <= 60) {
                days = 2;
            } else if (distance > 60 && distance <= 100) {
                days = 3;
            }
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет!");

            return -1;
        }
        return days;

    }
}