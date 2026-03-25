package 继承.课堂练习.构造方法.老师学生;

/**
 * ClassName: Person
 * Package: 继承.课堂练习.构造方法.老师学生
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 08:52
 * @Version: v1.0
 *
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造执行了");
    }

    public Person(int age, String name) {
        System.out.println("父类的带参构造执行了");
        this.age = age;
        this.name = name;
    }
}
