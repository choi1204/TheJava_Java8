package study.java8.Optional;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 9강 Optional
 * 리턴타입으로만 사용하기를 권장.
 * Collection, Map, Stream, Array, Optional은 Optional로 감싸지 말 것.
 */
public class _1_App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        OnlineClass spring_boot = new OnlineClass(1,"spring boot", false);
        Optional<Progress> studyDuration = spring_boot.getProgress();
        studyDuration.ifPresent(s -> System.out.println(s.getStudyDuration()));
    }
}
