package homework3;

public class Film {

    public static void main(String[] args) {
        //  3. Задача про массив объектов
        // создайте класс Movie
        // в классе создайте поля:
        //название
        //рейтинг (от 0 до 10)
        // жанр
        // страна
        // есть ли оскар (да/нет)
        // создайте в другом классе метод psvm.
        //в этом методе объявите массив films
        //положите в массив 3 любимых фильма

        Movie[] film = new Movie[3];
        film[0] = new Movie("Первый фильм", 5.0, "Ужасы", "США", false);
        film[1] = new Movie("Второй фильм", 9.8, "Драма", "США", true);
        film[2] = new Movie("Третий фильм", 2.3, "Комедия", "США", false);


        //используя цикл, напечатайте информацию о всех фильмах из задания
        //"задача про массив объектов" в формате "год - название - жанр - рейтинг"
        for (int i = 0; i < film.length; i = i + 1) {
            String info = film[i].name + "-" + film[i].rating + "-" + film[i].genre + "-" + film[i].country + "-" + film[i].oscar;
            System.out.println(info);
        }
    }
}

