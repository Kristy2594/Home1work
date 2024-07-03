package homework4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String password = "Qwerty0987654321";
        System.out.println("Введите пароль: ");
        String pass = new Scanner(System.in).nextLine();

        if (pass.equals(password)) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
    }
}
