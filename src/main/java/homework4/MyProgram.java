package homework4;

import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {


        Card myCard = new Card("454546626256666", "12.24", "343", "4791");

        myCard.MaskedCardNumber(myCard.getNumber());
        myCard.checkPinCode("9899");
    }
}
