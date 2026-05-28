package ch01课堂代码.ch02权限修饰符.bbb;
import ch01课堂代码.ch02权限修饰符.aaa.Person;

/**
 * ClassName: Test
 * Package: bbb
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/27 - 16:59
 * @Version: v1.0
 *
 */
public class Test {
    //不同包下的无关类
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        p.test();
    }
}
