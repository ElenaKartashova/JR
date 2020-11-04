package task_9_6;

/*
Исключение при работе с числами Ӏ Java Syntax: 9 уровень, 6 лекция
*/
/*
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.

Требования:
•	Программа должна выводить сообщение на экран.
•	В программе должен быть блок try-catch.
•	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
•	Выведенное сообщение должно содержать тип возникшего исключения.
•	Имеющийся код в методе main не удалять.
 */

public class DivisionOnZero {

    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e)
        {
        }
        //напишите тут ваш код
        System.out.println("ArithmeticException");
    }
}
