package 面向对象基础.面向对象.同学;

/**
 * ClassName: Test
 * Package: 面向对象基础.面向对象.同学
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 15:35
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        //创建同学相关类
        tsxt tx = new tsxt();
        //赋值
        tx.name = "张三";
        tx.age = 18;
        tx.height =18.5;
        tx.gender = true;
        //打印对象
        System.out.println("姓名:"+tx.name);
        System.out.println("性别:"+tx.gender);
        System.out.println("年龄:"+tx.age);
        System.out.println("身高:"+tx.height);
    }
}
