package 面向对象基础.面向对象练习.老师;

/**
 * ClassName: Test
 * Package: 面向对象基础.面向对象练习.老师
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 16:29
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        //创建对象
        teacher t1 = new teacher();
        //附加属性
        t1.name = "张三";
        t1.age = 18;
        //打印信息
        System.out.println("姓名:"+t1.name+"-年龄:"+t1.age);
        //老师的行为
        t1.teach();
        t1.eat();
        t1.sleep();
    }
}
