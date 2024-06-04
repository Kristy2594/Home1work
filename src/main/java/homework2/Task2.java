package homework2;

public class Task2 {
    public static void main(String[] args) {
        Flat flat1 = new Flat();
        flat1.district = "Красносельский";
        flat1.numberOfRooms = 1;
        flat1.floor = 4;
        flat1.area= 40.18;
        flat1.price = 34000;

        System.out.println("Район  " + flat1.district);
        System.out.println("Этаж  " + flat1.floor);
        System.out.println("Комнат в квартире  " + flat1.numberOfRooms);
        System.out.println("Площадь  " + flat1.area);
        System.out.println("Цена  " + flat1.price);

        System.out.println();

        Room room1 =  new Room();
        room1.area = 20;
        room1.ceilingHeight= 2.75;
        room1.furniture = true;
        room1.color = "Кашемир";

        System.out.println("Площадь комнаты  " + room1.area);
        System.out.println("Высота потолка  " + room1.ceilingHeight);
        System.out.println("Наличие мебели  " + room1.furniture);
        System.out.println("Цвет стен  " + room1.color);
    }

}
