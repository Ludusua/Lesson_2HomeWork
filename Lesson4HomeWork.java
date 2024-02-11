package lesson_4;

public class Lesson4HomeWork {
    public static void main(String[] args) {
        System.out.println("14: " + isDividedBy5Or7(14));
        System.out.println("11: " + isDividedBy5Or7(11));
        System.out.println("35: " + isDividedBy5Or7(35));
        System.out.println("leap 1900: " + isLeapYear(1900));
        System.out.println("leap 2000: " + isLeapYear(2000));
        System.out.println("leap 2024: " + isLeapYear(2024));

        System.out.println("contains 76 64: " + contains(76, 64));
        System.out.println("contains 45 71: " + contains(45, 71));
        System.out.print("printSeconds 3662: ");
        printSeconds(3662);
        System.out.println("10 eur convert to yen: "+convert(10,'Y'));

    }

    //Напишите функцию, которая проверяет, является ли год високосным
    // или нет - должна принимать год и возвращать true/false -

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;

        } else if (year % 100 == 0) {
            return false;

        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }


    }

    // Напишите функцию, которая проверяет, что число делится
// на 5 или на 7 - должна возвращать true/false
    // пример 14->true, 11->false, 15->true
    public static boolean isDividedBy5Or7(int number) {
        boolean result = (number % 7 == 0) || (number % 5 == 0);
        return result;
    }
    /*
    true && true ==true
    true && false == false
    false && false == false
    false && true == false

    true || true == true
    true || false == true
    false || false == false
    false || true == true
     */


    //3 Напишите функцию, которая принимает два целых числа от 25 до 75 и возвращает true,
// если в обоих числах есть общая цифра - пример: 43,14-> true, 71,23-> false
    public static boolean contains(int a, int b) {
        String f = "" + a; //"76"
        String s = "" + b; //"64"
        String f1 = f.substring(0, 1); //первый символ "7"
        String f2 = f.substring(1, 2); // второй символ "6"
        return s.contains(f1) || s.contains(f2);

    }

    // напишите функцию принимающую целое число секунды и печатающую
    // часов:минут:секунд например 3662->1:1:2

    public static void printSeconds(int t) {
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = (t - h * 3600 - m * 60);
        System.out.println("" + h + ":" + m + ":" + s);
    }
// Напишите функцию калькулятор курсов валюты - принимает сумму в евро и символ валюты, в которую нужно перевести -
//R - рубль
//D - доллар
//Y - йена
//G - фунт стерлингов
//должна возвращает сумму в выбранной валюте
//внутри функции воспользуйтесь найденными в интернет актуальными курсами обмена

    public static double convert(double e, char c) {
        // r - 97,46
        // d - 1,07
        // y - 158.98
        // g - 0.85
        if (c == 'R') {
            return e * 97.46;

        } else if (c == 'D') {
            return e * 1.07;
        } else if (c == 'Y') {
            return e * 158.98;

        } else if (c == 'G') {
            return e * 0.85;


        }else {
            return 0;
        }

    }

}




