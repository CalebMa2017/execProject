package month01.week02;

import org.junit.Test;

import java.util.Optional;
class CustomException extends RuntimeException {
    public CustomException() {}
    public CustomException(String message) {super(message);}
}
public class OptionalTestDemo {
    public static void main(String[] args) {
        Optional<String> zhangsan = Optional.of("zhangsan");
        Optional<Object> o = Optional.ofNullable(null);
        try {
            Object o1 = o.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(zhangsan.get());
        System.out.println(zhangsan.orElse("lisi"));
        System.out.println(o.orElse("lisi"));
        Object o1 = o.orElseGet(() -> "orElseGet");
        System.out.println(o.isPresent());//true
        try {
            o.orElseThrow(()->new CustomException());
        } catch (CustomException e) {
            e.printStackTrace();
        }
        zhangsan.map(value->value.toUpperCase());
        zhangsan.flatMap(value->Optional.of(value.toUpperCase()));
    }
    @Test
    public void test01() {
        Optional<Object> nullo = Optional.ofNullable(null);
        Optional<String> o = Optional.of("Optional");
        System.out.println(o.get());
        try {
            System.out.println(nullo.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nullo.orElse("null"));
        System.out.println(nullo.orElseGet(() -> "null"));
        try {
            System.out.println(nullo.orElseThrow(()->new CustomException()));
        } catch (CustomException e) {
            e.printStackTrace();
        }
        System.out.println(nullo.isPresent());//false
        System.out.println(nullo.map(value -> {
            if (null == value) ;
            return value;
        }));
        System.out.println(o);
        System.out.println(o.flatMap(value -> Optional.of(value.toUpperCase())).get());
    }
}
