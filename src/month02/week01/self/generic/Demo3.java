package month02.week01.self.generic;

import org.junit.Test;

public class Demo3 {
    class Generic<T>{
        private T key;
        public T getKey() {
            return key;
        }
        public Generic(T key) {
            this.key=key;
        }
    }
    class Generic2<T extends Number> {
        private T key;

        public Generic2(T key) {
            this.key = key;
        }


        public T getKey() {
            return key;
        }
    }
    @Test
    public void test2() {
        String s = "Hello China";
        Generic2 g2 = new Generic2(3);
        Number key = g2.getKey();
    }

    /**
     * 测试用构造方法传入泛型，会不会有效
     */
    class Generic3<T> {
        private T key;
        public Generic3() {
        }
        public Generic3(T key) {
            this.key=key;
        }
        public T getKey() {
            return key;
        }
    }
    @Test
    public void test3() {
        Generic3 g3 = new Generic3("Hello World!");
        Object key = g3.getKey();
        System.out.println(key);
        Generic3 g32 = new Generic3<>("I love China.");
        Object key1 = g32.getKey();
        System.out.println(key1);
        Generic3 g33 = new Generic3<String>("333");
        Object key2 = g33.getKey();
        System.out.println(key);
        Generic3<String> g34 = new Generic3("333");
        String key3 = g34.getKey();
        System.out.println(key3);
        Generic3<String> g35 = new Generic3("3333");
        String key4 = g35.getKey();
        System.out.println(key4);
        Generic3<String> g36 = new Generic3();
        String key5 = g36.getKey();
        System.out.println(key5);
        Generic3<String> hello_world = new Generic3("Hello World");
        String key6 = hello_world.getKey();
        System.out.println(key6);
    }

    /**
     * 泛型应用：泛型类中用?声明
     */
    class Generic4<T extends Object> {
        private T t;

        public T getT() {
            return t;
        }
        public Generic4(T t) {
            this.t = t;
        }
        public Generic4() {
        }
    }



    @Test
    public void test1() {
        showKeyValue1(new Generic<Integer>(3));
    }
    public <T> void showKeyValue1(Generic<? extends Object> obj){
        System.out.println("泛型测试"+"key value is " + obj.getKey());
    }

}
