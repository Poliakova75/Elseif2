public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Некорректное значение переменной clientOS");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача 2");
        int clientOS = 0; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2014;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректное значение переменной clientOS");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int year = 1600;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("\nЗадача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance <= 60) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);

        } else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);

        } else {
            System.out.println("Доставка невозможна ");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        int monthNumber = 9;
          var season = "";

        if (monthNumber > 12) {
            System.out.println("Неверный номер месяца");
        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "неизвестный";
        }
        System.out.println("Месяц " + monthNumber + " принадлежит к сезону " + season + ".");

    }
}




