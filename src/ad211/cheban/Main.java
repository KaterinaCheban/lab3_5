package ad211.cheban;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) { // вводим данные
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть перше слово: ");
        String word1 = in.next();
        System.out.println("Введіть друге слово: ");
        String word2 = in.next();
        System.out.println("Результат: " + getWord3(word1, word2));} // выводим результат
    public static String getWord3(String word1, String word2) { // мешаем буквы
        int length = Math.max(word1.length(), word2.length());
        StringBuilder word3 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < word1.length()) {
                word3.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                word3.append(word2.charAt(i));
            }
        }
        return word3.toString();
    }
}