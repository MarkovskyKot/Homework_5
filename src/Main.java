public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS=0;
        switch (clientOS){
        case 0:
            System.out.println("Установите версию приложения для iOS по ссылке");
            break;
        case 1:
            System.out.println("Установите версию приложения для Android по ссылке");
            break;
        default:
            System.out.println("У вас Windows?..");
        }
        System.out.println();
        //ИЛИ
        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("У вас Windows?..");
        }
        System.out.println();
        //Задача 2
        int clientDeviceYear=2013;
        if (clientDeviceYear<2015){
            if (clientOS==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("У вас Windows?..");
            }

        } else if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("У вас Windows?..");
        }
        System.out.println();
        //А если совсем без вложений...
        if (clientOS==0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS==1 && clientDeviceYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS==0 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS==1 && clientDeviceYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("У вас Windows?..");
        }
        System.out.println();
        //Задача 3
        int year=2021;
        if (year>=1584){
            if (year%400==0){
            System.out.println(year+" год является високосным");
            } else if (year%4==0 && year%100!=0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
        if (year>=1584){
            if (year%400==0 || year%4==0 && year%100!=0){
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Даже упростить получилось и всё работает... Класс!
        //Так понимаю если выполняется условие "year%400==0", то следующее условие даже не проверяется
        System.out.println();
        //Задача 4
        int deliveryDistance=95;
        int deliveryTime;
        if (deliveryDistance>0 && deliveryDistance<=20){
            deliveryTime=1;
            System.out.println("Потребуется дней: "+deliveryTime);
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            deliveryTime=2;
            System.out.println("Потребуется дней: "+deliveryTime);
        } else if (deliveryDistance>60 && deliveryDistance<=100) {
            deliveryTime=3;
            System.out.println("Потребуется дней: "+deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        //Задача 5
        int monthNumber=7;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}