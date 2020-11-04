package task_9_2;
/*
Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.

Требования:
•	Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
•	Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
•	Воспользуйся методом Thread.currentThread().getStackTrace().
•	Метод main должен вызывать метод getStackTraceDepth.
 */

/*
Там, в синих глубинах стек-трейса…
*/
public class StackTrace_9_5 {
    public static void main(String[] args) {
       int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements.length);
        return stackTraceElements.length;
    }
}
