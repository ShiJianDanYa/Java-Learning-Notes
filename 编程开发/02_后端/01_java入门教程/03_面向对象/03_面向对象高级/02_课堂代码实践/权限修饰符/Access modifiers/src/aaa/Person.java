package aaa;

/**
 * ClassName: Person
 * Package: aaa
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/27 - 16:58
 * @Version: v1.0
 *
 */
public class Person {
    //父类
    public String name;
    public void test(){
        System.out.println("父类test方法");
    }
    //同一类中
    public void show(){
        System.out.println(name);
        test();
    }
}
