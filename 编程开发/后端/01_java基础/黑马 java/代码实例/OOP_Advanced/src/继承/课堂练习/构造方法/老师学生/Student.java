package 继承.课堂练习.构造方法.老师学生;

/**
 * ClassName: Student
 * Package: 继承.课堂练习.构造方法.老师学生
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/20 - 08:53
 * @Version: v1.0
 *
 */
public class Student extends Person {
    String className;
    //构造方法
    //1. 空参构造
    public Student(){
        System.out.println("子类Student的无参构造方法执行了");
    }
    //2. 带参构造  （父+子）
    //父类中的属性：通过super（参数）的形式传递给父类的构造方法赋值
    //子类中的属性：自己赋值
    public Student(int age, String name, String className){

        this.className = className;
        System.out.println("子类Student的有参构造方法执行了");

        super(age, name);
    }
}
