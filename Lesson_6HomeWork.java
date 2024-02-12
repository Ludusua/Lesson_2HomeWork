package Lesson_6;

public class Lesson_6HomeWork {

    public static void main(String[] args) {
        double a = 14.0;
        double b = 7.0;
        char doIt = '+';

        double result = calculate(a, b, doIt);
        System.out.println(a + " " + doIt + " " + b + " = " + result);

        System.out.println("");
        System.out.println("");
        System.out.println("Задание 2");

        //Задание 2
        int A = 70;
        printNum(A);



    } // main



    //Напишите функцию-калькулятор должна принимать два числа double и операцию
    // над ними - символ '*', '/', '+' или '-' и возвращать результат этой операции
    public static double calculate(double a, double b, char doIt) {
        double result = 0.0;

        switch (doIt) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (a != 0) {
                    result = a / b;
                } else {
                    System.out.println("Деление на ноль");
                }
                break;
            default:
                System.out.println("Недопустимая операция");
        }

        return result;
    }

//Напишите функцию, которая принимает параметр А и перебирает
// все числа от 1 до A с шагом 1 и печатает только числа, кратные 5, 7 или 13
    public static void printNum(int A) {
        for (int i = 1; i<=A;i++){
            if (i%5 ==0||i%7==0||i%13==0){
                System.out.println(i);
            }
        }
    }

}

