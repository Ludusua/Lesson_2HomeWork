package lesson_9;

public class Lesson9HomeWork {
    public static void main(String[] args) {
        System.out.println("firstBigLetters(Когда я был еще маленький я любил кушать овсянку): " + firstLetters("Когда я был еще маленький я любил кушать овсянку").toUpperCase());
        System.out.println("countSymbols: " + countSymbols("Sometimes i want to say something", 't'));

    } // main

    //напишите функцию которая возвращает строку из первых букв передаваемой в нее фразы
    //Пример: "Однажды в студеную зимнюю пору"->"Овсзп"
    public static String firstLetters(String s) {
        StringBuilder sb = new StringBuilder();
        String[] w = s.split(" ");
        for (int i = 0; i < w.length; i++) {
            sb.append(
                    w[i].charAt(0)
            );

        }
        return sb.toString();
    }

    //напишите функцию которая подсчитывает количество символов в передаваемой в нее строке
    // Например "London i a capital of Great Britain"-> 3(подсчитаных букв 'о')
    public static int countSymbols(String s, char target) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;

            }
        }
        return count;
    }









}
