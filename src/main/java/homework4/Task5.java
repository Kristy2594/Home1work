package homework4;

import java.util.Scanner;

public class Task5 {


    public static void main(String[] args) {
        System.out.println("Введите пароль: ");
        String password = new Scanner(System.in).nextLine();
        if (password.length() >= 8) {
            if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("No")) {
                if (password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9")) {
                    System.out.println("Пароль принят");
                } else {
                    System.out.println("Пароль должен содержать минимум 1 цифру");
                }
            } else {
                System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            }
        } else {
            System.out.println("Пароль не менее 8 символов");
        }
    }
}




