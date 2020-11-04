package kotiki;

public class A {

    public static void main (String[] Args) {

    }

    A() {
        String t = "Тест";
    }

    public class B extends A {
        B() {
            System.out.println("Тест");
        }
    }

   public class C extends B {
        C() {
            String t = "Тест";
        }
    }

    C c = new C();

}
