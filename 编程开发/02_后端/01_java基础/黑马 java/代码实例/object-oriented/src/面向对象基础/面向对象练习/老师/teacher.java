package 面向对象基础.面向对象练习.老师;

/**
 * ClassName: teacher
 * Package: 面向对象基础.面向对象练习.老师
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 16:27
 * @Version: v1.0
 *
 */
public class teacher {
    /*
    面向对象思想表示老师
    属性：姓名、年龄
    行为：授课、吃饭、睡觉
    */
    //属性
    String name;
    //年龄
    int age;
    //行为 能干什么 方法的形式进行体现(不加static)
    //授课
    public void teach(){
        System.out.println("老师授课");
    }
    //吃饭
    public void eat(){
        System.out.println("老师吃饭");
    }
    //睡觉
    public void sleep(){
        System.out.println("老师睡觉");
    }
}
