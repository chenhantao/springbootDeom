package cht.function;

/**
 * TODO
 *
 * @author chenhantao
 * @since 2019/4/4
 */
public class ThreadTest {
    private static Integer num = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(num++)).run();
        }
    }
}
