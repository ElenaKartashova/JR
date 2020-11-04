package objects.garbage;

public class February extends Zodiak {

    String color;
    String human;


    public February(String name, int number, int days, String color, String human) {
        super(name, number, days);
        this.color = color;
        this.human = human;

    }

    public static void main(String[] args) {

        February februaryOne = new February("February", 2, 28, "White", "Lena");
        System.out.println(februaryOne.name);
        System.out.println(februaryOne.human);

        February februaryTwo = new February("February", 2, 28, "White", "Dima");

        System.out.println(februaryTwo.name);
        System.out.println(februaryTwo.human);
        System.out.println(februaryOne.human);

    }

}

