public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte clientOS = 0;
        if (clientOS == 1) {
            System.out.println(" Утановите приложение для Android по ссылке.");
        } else {
            System.out.println(" Установите приложение для iOS по ссылке.");
        }
        System.out.println("Задача 2");
        byte clientOS1 = 1;
        int clientYear = 2014;
        if (clientOS1 == 0 && clientYear <= 2015) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке.");
        }
        if (clientOS1 == 1 && clientYear <= 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOS1 == 1) {
            System.out.println("Установите приложение для iOS по ссылке.");
        }
        System.out.println(" Задача 3 ");
        int year = 4556;
        if ((year % 4) == 0 && ((year % 100) != 0 && (year > 1584) || (year % 400) == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println(" Год не високосный.");
        }
        System.out.println("Задача 4");
        int deliveryDistance = 23;
        int deleveryDay = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + deleveryDay + " день.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println(" Потребуется " + (deleveryDay + 1) + " дня.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println(" Потребуется " + (deleveryDay + 2) + " дней.");
        } else {
            System.out.println("Доствавки нет.");
        }
        System.out.println("Задача 5");
        byte monthNumber = 4;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" Осень ");
                break;
            default:
                System.out.println(" Введите число от 1 до 12.");
        }
    }


}

