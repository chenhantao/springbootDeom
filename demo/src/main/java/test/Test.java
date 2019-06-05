package test;

import lombok.Data;

/**
 * TODO
 *
 * @author chenhantao
 * @since 2019/4/3
 */
public class Test {
    public static void main(String[] args) {

        User a = new User();
        User b = new User();
    }

}

@Data
class User {
    private int numA;
    private Integer numB;
}
