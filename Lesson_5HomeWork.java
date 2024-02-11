package lesson_5;

public class Lesson_5HomeWork {
    public static void main(String[] args) {
        System.out.println("convert евро " + converter("евро"));
        System.out.println("dial X "+dial('F'));
        System.out.println("findMaxDigit 567: "+findMaxDigit(567));
    } // main

    /*
    Напишите с помощью switch функцию, которая принимает на вход название валюты и возвращает ее международный код.
    Для японской йены, английского фунта, доллара сша, евро и монгольского тугрика.
    Коды валют посмотрите в интернет. Например: "евро" -> "EUR"
    JPY GBP USD EUR MNT
     */
    public static String converter(String s) {
        return switch (s) {
            case "йена" -> "JPY";
            case "фунт" -> "GBP";
            case "доллар" -> "USD";
            case "евро" -> "EUR";
            case "тугрик" -> "MNT";
            default -> "не знаю";
        };
    }


    /*Напишите функцию, которая реализует выбор цифры при нажатии на буквы на телефонном номеронаберателе.
     Функция должна принимать на вход символ и возвращать целое число.
      Буквам 'A','B','C' соответствует цифра 2,
       буквам 'D','E','F' соответствует 3,
        GHI 4, JKL 5 , MNO 6 , PQRS 7 , TUV 8 , WXYZ 9 - как на картинке ниже.
         Пример: 'P' -> 7

     */
    public static int dial(char c) {
        return switch (c) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> -1;
        };
    }

    /*
    Напишите функцию которая принимает на вход трехзначное целое число
    и возвращает самую большую цифру.
    Например: 382->8
     */

    public  static int findMaxDigit (int d){
        int f = d/100; // 382 -> 3
        int s = (d-f*100)/10; // (382 - 3*100)=82   82/10 -> 8
        int t = (d-f*100-s*10); // (382 - 3*100 - 8*10) ->2

        int r = f > s ? f : s;
        r = r > t ? r : t;
        return r;


    }

}
