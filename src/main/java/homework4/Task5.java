package homework4;

import java.util.Scanner;

public class Task5 {

    // Данное упражнение так и не поняла. Как с помощью изученных тем сделать.
    //Уже убежали на темы вперед...


    public static void main(String[] args) {
        String password = new Scanner(System.in).nextLine();
        if (password.length() >= 8) {
            if (password.contains("!")) {
                System.out.println("Пароль принят");
            } else {
                System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            }
        } else {
            System.out.println("Пароль не менее 8 символов");
        }
    }
}



