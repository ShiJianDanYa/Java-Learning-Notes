package 面向对象基础.面向对象.狗;

/**
 * ClassName: Test
 * Package: 面向对象基础.面向对象.狗
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 11:40
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        /*创建对象，记录第一只小狗的信息
        格式：
            类名 对象名 = new 类名();
        */
        //创建一个对象.管理第一只小狗信息
        Dog d1 = new Dog();
        d1.name = "大黄";
        d1.age = 15;
        d1.weight =  20.0;
        d1.color ="黄色";
        //输出小狗信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.color);
        //创建一个对象.管理第二只小狗信息
        Dog d2 = new Dog();
        d2.name = "小白";
        d2.age = 13;
        d2.weight =  18.0;
        d2.color ="白色";
        //输出小狗信息
        System.out.println(d2.name);
        System.out.println(d2.age);
        System.out.println(d2.weight);
        System.out.println(d2.color);
    }
}
