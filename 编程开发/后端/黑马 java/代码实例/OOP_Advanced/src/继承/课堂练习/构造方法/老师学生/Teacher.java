package 继承.课堂练习.构造方法.老师学生;

/**
 * ClassName: Teacher
 * Package: 继承.课堂练习.构造方法.老师学生
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 08:53
 * @Version: v1.0
 *
 */
public class Teacher extends Person {
    String subject;
    //构造方法
    //1. 无参构造
    public Teacher()
    {
        System.out.println("子类Teacher的无参构造方法执行了");
    }
    //2. 有参构造
    public Teacher(int age, String name, String subject){
        this.age = age;
        this.name = name;
        this.subject = subject;
        System.out.println("子类Teacher的有参构造方法执行了");
    }

}
