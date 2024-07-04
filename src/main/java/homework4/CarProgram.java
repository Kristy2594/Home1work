package homework4;

public class CarProgram {
    public static void main(String[] args) {

        //2. Разгон автомобиля
// Создайте класс Car
// Поля могут быть любые.
// Обязательно должно быть поле currentSpeed (тип данных int). По умолчанию currentSpeed = 0;
// Создайте метод getCurrentSpeed. Метод должен возвращать (return) текущую скорость
// Создайте метод speedUp, который принимает на вход число. Метод должен увеличивать текущую скорость на заданное число.
// Создайте метод break(), который сокращает текущую скорость на 10 единиц.
// Если текущая скорость <= 10, то метод делает текущую скорость равной 0
// Создайте класс MyProgram + метод psvm .
// В методе создайте новый экземпляр класса.
// Запросите текущую скорость и выведите ее на экран.
// Увеличьте скорость на 25 единиц.
// Запросите текущую скорость и выведите ее на экран. Должно быть 25
// Вызовите метод brake()
// Запросите текущую скорость и выведите ее на экран. Должно быть 15
// Вызовите метод brake()
// Запросите текущую скорость и выведите ее на экран. Должно быть 5
// Вызовите метод brake()
// Запросите текущую скорость и выведите ее на экран. Должно быть 0

        Car myNewCar = new Car( "белый", 12, "ауди" );

        int speed=myNewCar.getCurrentSpeed();
        System.out.println(speed);//тут0

        myNewCar.speedUp(25);
        speed=myNewCar.getCurrentSpeed();
        System.out.println(speed);//тут25

        myNewCar.brake();
        speed=myNewCar.getCurrentSpeed();
        System.out.println(speed);//тут15

        myNewCar.brake();
        speed=myNewCar.getCurrentSpeed();
        System.out.println(speed);//тут5

        myNewCar.brake();
        speed=myNewCar.getCurrentSpeed();
        System.out.println(speed);//тут0
    }
}
