package arrays;

public class ArrayLength {


    public static void main(String[] args) {

        String[] birthdays = new String[10];
        birthdays[0] = "Лена Елисеева, 12 марта";
        birthdays[1] = "Коля Романов, 18 мая";
        birthdays[2] = "Вика Игнатова, 12 июля";
        birthdays[3] = "Денис Козлов, 7 сентября";
        birthdays[4] = "Максим Масленников, 9 ноября";
        birthdays[5] = "Роман Баранов, 14 августа";
        birthdays[6] = "Валерия Пяткина, 1 апреля";
        birthdays[7] = "Олеся Остапенко, 3 января";
        birthdays[8] = "Костя Гурко, 19 октября";
        birthdays[9] = "Сережа Наумов, 3 мая";

        for (int i = 0; i < birthdays.length; i++) {
            System.out.println(birthdays[i]);
        }
        System.out.println();
        int[] numbers = {7, 12, 8, 4, 33, 79, 1, 16, 2};
        System.out.println(numbers.length); // Этот способ называется “быстрой инициализацией”
    }
}
