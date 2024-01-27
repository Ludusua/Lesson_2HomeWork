package Lesson_2;

public class lesson_2_HomeWork {
    public static void main(String[] args) {
        /* Создать переменные всех примитивных типов и вывести их значения на экран
Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
 Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
 Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
  Отдельно выведите на экран сумму скидки от этой покупки.

         */

        int laptop = 1000;
        int mobilphone = 500;
        int discount = 100;
        int buyAll = laptop + mobilphone - discount;
        System.out.println();
        System.out.println("Задание№2");
        System.out.println("Сумма при покупке ноутбока и телефона включая скидку: " + buyAll + " рублей");
        System.out.println("Сумма скидки при покупке ноутбока и телефона вместе:  " + discount + " рублей");

        int zero = 0;
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;
        int sumAll = zero + one + two + three + four + five + six + seven + eight + nine;
        int srednee = sumAll / 10;
        int ostatok = sumAll % 10;


        System.out.println();
        System.out.println("Задание№3");

        System.out.println("Сумма десяти чисел: " + sumAll);
        System.out.println("Среднее арифметическое десяти чисел: " + srednee);
        System.out.println("Остаток от деления: " + ostatok);

        double deposit = 1250.0;
        double summaProzentovZaPervyiGod = deposit * 3.5 / 100;
        double summaZaOdinGod = deposit + summaProzentovZaPervyiGod;
        double summaProzentovZaVtoroiGod = summaZaOdinGod * 3.5 / 100;
        double summaZaDvaGoda = summaZaOdinGod + summaProzentovZaVtoroiGod;
        double summaProzentovZaTretiiGod = summaZaDvaGoda * 3.5 / 100;
        double summaZaTriGoda = summaZaDvaGoda + summaProzentovZaTretiiGod;
        double summaProzentovZaChetvertyiGod = summaZaTriGoda * 3.5 / 100;
        double summaZaChetyreGoda = summaZaTriGoda + summaProzentovZaChetvertyiGod;
        double summaProzentovZaPyatyiGod = summaZaChetyreGoda * 3.5 / 100;
        double summaZaPyatLet = summaZaChetyreGoda + summaProzentovZaPyatyiGod;


        String pyatoeZadanie = "678";


        System.out.println();

        System.out.println("Задание№4");
        System.out.println("Сколько было положено на депозит:              " + deposit);
        System.out.println("Начисление процентов за первый год:            " + summaProzentovZaPervyiGod);
        System.out.println("Депозит и проценты за первый год:              " + summaZaOdinGod);
        System.out.println("Начисление процентов за второй год:            " + summaProzentovZaVtoroiGod);
        System.out.println("Депозит и проценты за второй год:              " + summaZaDvaGoda);
        System.out.println("Начисление процентов за третий год:            " + summaProzentovZaTretiiGod);
        System.out.println("Депозит и проценты за третий год:              " + summaZaTriGoda);
        System.out.println("Начисление процентов за четвертый год:         " + summaProzentovZaChetvertyiGod);
        System.out.println("Депозит и проценты за четвертый год:           " + summaZaChetyreGoda);
        System.out.println("Начисление процентов за пятый год:             " + summaProzentovZaPyatyiGod);
        System.out.println("Депозит и проценты за пятый год:               " + summaZaPyatLet);

        System.out.println();
        System.out.println("Задание№5");
        System.out.println(pyatoeZadanie.charAt(0));
        System.out.println(pyatoeZadanie.charAt(1));
        System.out.println(pyatoeZadanie.charAt(2));


    }
}
