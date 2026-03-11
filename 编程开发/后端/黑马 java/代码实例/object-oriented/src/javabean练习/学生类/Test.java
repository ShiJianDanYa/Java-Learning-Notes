package javabean练习.学生类;

/**
 * ClassName: Test
 * Package: javabean练习.学生类
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 21:23
 * @Version: v1.0
 *
 */
public class Test {
    /*定义一个Javabean类描述学生：属性：姓名年龄
    行为：学习，吃饭，睡觉*/
    public static void main(String[] args){
        student s1 = new student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println("姓名："+s1.getName()+"年龄："+s1.getAge());
        s1.study();
        s1.eat();
        s1.sleep();
    }

}
