package 构造方法.课堂练习;

/**
 * ClassName: Test
 * Package: 构造方法.课堂练习
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 20:18
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        //创建对象 空参构造
        student s1 = new student();
        //手动调用构造方法
        //s1.student();
        //输出对象属性
        System.out.println("姓名:"+s1.getName());
        System.out.println("年龄:"+s1.getAge());
        System.out.println("性别:"+s1.getSex());
        System.out.println("身高:"+s1.getHeight());
        System.out.println("------------------");
        //创建对象 全参构造
        student s2 = new student("张三",18,'男',180.5);
        //输出对象属性
        System.out.println("姓名:"+s2.getName());
        System.out.println("年龄:"+s2.getAge());
        System.out.println("性别:"+s2.getSex());
        System.out.println("身高:"+s2.getHeight());
        System.out.println("------------------");
    }
}
