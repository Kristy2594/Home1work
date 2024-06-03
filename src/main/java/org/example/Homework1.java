package org.example;

public class Homework1 {
    public static void main(String[] args) {

        String poem = " Шаганэ ты моя, Шаганэ!Потому, что я с севера, что ли,Я готов рассказать тебе поле,Про волнистую рожь при луне.";

        //Возвращает длину строки
        int result = poem.length();
        System.out.println(result);

        //Позволяет проверить строку на пустоту. Если строка пуста, он возвращает true
        boolean result2 = poem.isEmpty();
        System.out.println(result2);

        // Работает со строками, которые null, пустые или содержат только пробелы
        boolean result3 = poem.isBlank();
        System.out.println(result3);

        //Метод извлекает символы между двумя индексами (позициями) из строки и возвращает подстроку
        String result4 = poem.substring(1, 4);
        System.out.println(result4);

        //Метод возвращает позицию первого появления значения в строке
        int result5 = poem.indexOf("у");
        System.out.println(result5);

        //Метод возвращает индекс (позицию) последнего появления заданного значения в строке
        int result6 = poem.lastIndexOf("с");
        System.out.println(result6);

        //Метод преобразует строку в строчные буквы
        String result7 = poem.toLowerCase();
        System.out.println(result7);

        //Метод преобразует строку в прописные буквы
        String result8 = poem.toUpperCase();
        System.out.println(result8);

        //Метод возвращает новую строку с заменяемым значением
        String result9 = poem.replace("Шаганэ", "Ирина");
        System.out.println(result9);

        //Метод проверяет, начинается ли строка с указанного символа(ов)
        boolean result10 = poem.startsWith("И");
        System.out.println(result10);

        //Метод проверяет, заканчивается ли строка указанным символом(ами).
        boolean result11 = poem.endsWith(".");
        System.out.println(result11);

        //Метод повтояет значение переменной заданное количество раз
        String result12 = poem.repeat(3);
        System.out.println(result12);

        //Метод проверяет, содержит ли строка последовательность символов
        boolean result13 = poem.contains("урок");
        System.out.println(result13);

        //Метод добавляет строку к концу другой строки
        String result14 = poem.concat("Есенин");
        System.out.println(result14);

        //Метод удаляет пробел с обоих концов строки
        String result15 = poem.trim();
        System.out.println(result15);

        //Метод сравнивает две строки и возвращает true, если строки равны, и false, если нет
        boolean result16 = poem.equals(" Шаганэ ты моя, Шаганэ!Потому, что я с севера, что ли,Я готов рассказать тебе поле,Про волнистую рожь при луне.");
        System.out.println(result16);
    }
}