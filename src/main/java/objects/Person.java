package objects;

//initialize

public class Person {

    String name;
    int age;
    String address;
    char sex;

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("Name", 25, "address", 'M');
    }
    public void initialize(String name, int age, String address, char sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }
}
