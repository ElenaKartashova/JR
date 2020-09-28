package Task_9_2;
/*
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.

Требования:
•	В классе должно быть 5 методов (метод main не учитывать).
•	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
•	Каждый метод должен возвращать имя метода, вызвавшего его.
•	Для получения имени вызвавшего метода, используй метод getMethodName.
 */
/*
И снова StackTrace
*/
public class AgainStackTrace {

        public static void main(String[] args) throws Exception
        {
            method1();
        }

        public static String method1()
        {
            method2();
            //напишите тут ваш код
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.println(stackTraceElements[2].getMethodName());
            return (stackTraceElements[2].getMethodName());
        }

        public static String method2()
        {
            method3();
            //напишите тут ваш код
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.println(stackTraceElements[2].getMethodName());
            return (stackTraceElements[2].getMethodName());
        }

        public static String method3()
        {
            method4();
            //напишите тут ваш код
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.println(stackTraceElements[2].getMethodName());
            return (stackTraceElements[2].getMethodName());
        }

        public static String method4()
        {
            method5();
            //напишите тут ваш код
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.println(stackTraceElements[2].getMethodName());
            return (stackTraceElements[2].getMethodName());
        }

        public static String method5()
        {
            //напишите тут ваш код
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            System.out.println(stackTraceElements[2].getMethodName());
            return (stackTraceElements[2].getMethodName());
        }

}
