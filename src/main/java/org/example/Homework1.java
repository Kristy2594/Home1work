package org.example;

public class Homework1 {
    public static void main(String[] args) {

        String poem = " Шаганэ ты моя, Шаганэ!Потому, что я с севера, что ли,Я готов рассказать тебе поле,Про волнистую рожь при луне.";

        int result = poem.length(); //Возвращает длину строки
        System.out.println(result);

        boolean result2 = poem.isEmpty(); //  позволяет проверить строку на пустоту. Если строка пуста, он возвращает true
        System.out.println(result2);

        boolean result3 = poem.isBlank(); // Работает со строками, которые null, пустые или содержат только пробелы
        System.out.println(result3);

        String result4 = poem.substring(1,4); //Метод извлекает символы между двумя индексами (позициями) из строки и возвращает подстроку.
        System.out.println(result4);

        int result5 = poem.indexOf("у"); //Метод возвращает позицию первого появления значения в строке.
        System.out.println(result5);

        int result6 = poem.lastIndexOf("с"); //Метод возвращает индекс (позицию) последнего появления заданного значения в строке.
        System.out.println(result6);

        String result7 = poem.toLowerCase(); //Метод преобразует строку в строчные буквы.
        System.out.println(result7);

        String result8 = poem.toUpperCase(); //Метод преобразует строку в прописные буквы.
        System.out.println(result8);

        String result9 = poem.replace("Шаганэ", "Ирина"); //Метод возвращает новую строку с заменяемым значением
        System.out.println(result9);

        boolean result10 = poem.startsWith("И");//Метод проверяет, начинается ли строка с указанного символа(ов)
        System.out.println(result10);

        boolean result11= poem.endsWith("."); //Метод проверяет, заканчивается ли строка указанным символом(ами).
        System.out.println(result11);

        String result12 = poem.repeat(3); //Метод повтояет значение переменной заданное количество раз
        System.out.println(result12);

        boolean result13 = poem.contains("урок"); //Метод проверяет, содержит ли строка последовательность символов.
        System.out.println(result13);

        String result14 = poem.concat("Есенин"); //Метод добавляет строку к концу другой строки.
        System.out.println(result14);

        String result15 = poem.trim(); //Метод удаляет пробел с обоих концов строки.
        System.out.println(result15);

        boolean result16 = poem.equals(" Шаганэ ты моя, Шаганэ!Потому, что я с севера, что ли,Я готов рассказать тебе поле,Про волнистую рожь при луне."); //Метод сравнивает две строки и возвращает true, если строки равны, и false, если нет.
        System.out.println(result16);
    }
}