package study.java8.DateTime;

import org.springframework.cglib.core.Local;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 12강 Date와 Time APi
 */
public class _2_App {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant); // 기준시, UTC, GMT

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("UTC"));
        System.out.println(zonedDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime birthDay = LocalDateTime.of(1997, Month.MAY,17,0,0,0);

        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        ZonedDateTime zonedDateTime1 = instant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime1);

        //기간을 표현하는 방법
        LocalDate today = LocalDate.now();
        LocalDate thisYearBirthday = LocalDate.of(2020, Month.JULY,  15);

        Period period = Period.between(today, thisYearBirthday);
        System.out.println(period.getDays());

        Period until = today.until(thisYearBirthday);
        System.out.println(until.get(ChronoUnit.DAYS));

        LocalDateTime plus = now.plus(10, ChronoUnit.SECONDS);
        Duration between = Duration.between(now, plus);
        System.out.println(between.getSeconds());

        LocalDateTime timeNow = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(timeNow.format(MMddyyyy));

        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse);

        Date date = new Date();
        Instant instant1 =date.toInstant();
        Date newDate = Date.from(instant1);


    }
}
