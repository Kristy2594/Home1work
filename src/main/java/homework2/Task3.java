package homework2;

public class Task3 {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "бананы";
        item1.article = 5463773;
        item1.price = 89.9;
        item1.quantity = 1;
        item1.color = "зеленые";
        System.out.println( item1.name + '-' + item1.article + '-' + item1.price + '-' + item1.quantity + '-' + item1.color);

        Item item2 = new Item();
        item2.name = "яблоки";
        item2.article = 6564544;
        item2.price = 62;
        item2.quantity = 1;
        item2.color = "зеленые";
        System.out.println( item2.name + '-' + item2.article + '-' + item2.price + '-' + item2.quantity + '-' + item2.color);

        Item item3 = new Item();
        item3.name = "слива";
        item3.article = 7577843;
        item3.price = 59.9;
        item3.quantity = 1;
        item3.color = "фиолетовые";
        System.out.println( item3.name + '-' + item3.article + '-' + item3.price + '-' + item3.quantity + '-' + item3.color);

        Item item4 = new Item();
        item4.name = "апельсины";
        item4.article = 8765432;
        item4.price = 209.9;
        item4.quantity = 1;
        item4.color = "красные";
        System.out.println( item4.name + '-' + item4.article + '-' + item4.price + '-' + item4.quantity + '-' + item4.color);

        Item item5 = new Item();
        item5.name = "ежевика";
        item5.article = 678935;
        item5.price = 239.9;
        item5.quantity = 1;
        item5.color = "фиолетовая";
        System.out.println( item5.name + '-' + item5.article + '-' + item5.price + '-' + item5.quantity + '-' + item5.color);

    }
}
