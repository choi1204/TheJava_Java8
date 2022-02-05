package study.java8.DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 11강 Date와 Time
 * 기존의 Date와 Calender
 * Thread Safe 하지 않다.
 * Type Safe 하지 않다.
 */
public class _1_App {

    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        long time = date.getTime();
        Thread.sleep(10);
        date.setTime(time);
        System.out.println(date);
        System.out.println(time);

        Calendar birthDay = new GregorianCalendar(1982, Calendar.AUGUST, 15);

    }
}
