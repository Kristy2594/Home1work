package homework4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите url: ");
        String url = new Scanner(System.in).nextLine();

        if(url.startsWith("https://")){
            System.out.println("Соединение безопасное");
        }else {
            System.out.println("Небезопано. Не указывайте логины, пароли и данные банковских карт.");
        }

    }
}
