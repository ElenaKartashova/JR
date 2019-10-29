package objects;

//Разберись, что делает программа.
//Найди и исправь одну ошибку в классе Circle. Метод main изменять нельзя.
//
//Подсказка:
//изучи конструктор по умолчанию.
//
//Требования:
//Программа не должна считывать данные с клавиатуры.
//Метод main изменять нельзя.
//Программа должна вывести слово "Red" на экран.
//Метод getDescription класса Color должен возвращать значение переменной description.
//Метод setDescription класса Color должен устанавливать значение переменной description.
public class Circle1 {

    public Color color;

    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        circle1.color.setDescription("Red");
        System.out.println(circle1.color.getDescription());
    }

    public Circle1() {
        //Color color = new Color();
        this.color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
