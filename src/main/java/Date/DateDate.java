package Date;
import java.util.Date;

public class DateDate {
    public static void main (String[] args) throws InterruptedException {

        Date date = new Date(1577304491695L);
        System.out.println(date);

        Date date1 = new Date();
        System.out.println(date1);

        date1.getTime();
        System.out.println(date1.getTime());

        Date date2 = new Date();

        Thread.sleep(2000);//приостановим работу программы на 2 секунды
        Date date3 = new Date();

        System.out.println(date1.before(date3));
    }
}
