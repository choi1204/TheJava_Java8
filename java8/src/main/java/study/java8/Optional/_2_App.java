package study.java8.Optional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 10강 Optional API
 * get()사용할 시 null일경우 NoSuchElement 에러
 * -> 다른 방식으로 접근 권장.
 */
public class _2_App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .findFirst();

        boolean present = spring.isPresent();
        System.out.println(present);

        //ifPresent로 접근
        spring.ifPresent(oc -> System.out.println(oc.getTitle()));

        //orElse사용(있으면 가져오고 없으면 ()리턴. ()내부 동작은 항상함.)
        OnlineClass onlineClass = spring.orElse(createNewClass());

        //orElseGet(있으면 가져오고 없으면 ()리턴. 없을때만 ()내부 동작)
        OnlineClass onlineClass1 = spring.orElseGet(_2_App::createNewClass);

        //orElseThrow(없으면 에러발생)
        OnlineClass onlineClass2 = spring.orElseThrow(IllegalArgumentException::new);

        //filter
        Optional<OnlineClass> onlineClass3 = spring.filter(OnlineClass::isClosed);

        //map
        Optional<Optional<Progress>> progress = spring.map(OnlineClass::getProgress);
        Optional<Progress> progress2 = progress.orElse(Optional.empty());;

        //flatMap
        Optional<Progress> progress1 = spring.flatMap(OnlineClass::getProgress);



    }

    private static OnlineClass createNewClass() {
        return new OnlineClass(10,"New Class",false);
    }
}
