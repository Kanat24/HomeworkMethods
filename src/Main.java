import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    //Task1
    public static void Task1() {
        int year = 2022;
        CheckYear(year);
    }

    public static void CheckYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Год " + year + " явдяется високосным");
        } else
            System.out.println("Год " + year + " не явдяется високосным");
    }

    //Task2
    public static void Task2() {
        ChooseVersion(0, 2022);

    }

    public static void ChooseVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear > 2015 && clientDeviceYear <= currentYear) {
                System.out.println("У вас современный телефон, вы можете установить это приложение");
            } else if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("некорректный ввод");
            }
        } else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        if (clientDeviceYear > 2015 && clientDeviceYear <= currentYear) {
            System.out.println("У вас современный телефон, вы можете установить это приложение");
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("некорректный ввод");
        }

    }

    //Task3
    public static void Task3() {
        DeliveryDay(95);
    }

    public static int DeliveryDay(int deliveryDistance) {
        int deliveryPeriod = 0;
        if (deliveryDistance < 20) {
            deliveryPeriod = 1;
            System.out.println("Потребуется дней: " + deliveryPeriod + " сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryPeriod = 2;
            System.out.println("Потребуется дней: " + deliveryPeriod + " суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryPeriod = 3;
            System.out.println("Потребуется дней: " + deliveryPeriod + " суток");
        } else {
            System.out.println("Извините, вы слишком далеко, доставка невозможна");
        }
        return deliveryPeriod;

    }
}