package objects;

public class Cat1 {

    private String name;
    private int age;
    private int weight;

    public Cat1(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat1() {
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

        public static void main(String[] args) {

            Cat1 barsik = new Cat1("Барсик", 5, 4);
            String barsikName = barsik.getName();
            int barsikAge = barsik.getAge();
            int barsikWeight = barsik.getWeight();

            System.out.println("Имя кота: " + barsikName);
            System.out.println("Возраст кота: " + barsikAge);
            System.out.println("Вес кота: " + barsikWeight);
        }
    }

