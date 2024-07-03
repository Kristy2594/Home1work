package homework4;

public class Card {
   private String number;
   private String date;
   private String cvv;
   private String pinCode;


    public Card(String number, String date, String cvv, String pinCode) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
        this.pinCode = pinCode;
    }


    public void MaskedCardNumber(String number) {
        String maskedCardNumber = number.substring(number.length() - 4);
        System.out.println("**** **** **** " + maskedCardNumber);
    }

    public void checkPinCode(String pinCodeV){
        if (pinCodeV.equals(pinCode)){
            System.out.println(number);
        }else {
            System.out.println("Вы ввели неверный пин-код");
        }
    }

    public String getNumber(){
        return this.number;
    }
}
