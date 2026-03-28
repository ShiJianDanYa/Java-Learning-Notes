package 面向对象基础.面向对象练习.工人;

/**
 * ClassName: Test
 * Package: 面向对象基础.面向对象练习.工人
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 19:47
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        worker w1 = new worker();
        w1.name = "张三";
        w1.age = 18;
        w1.working = 10;
        //输出信息
        System.out.println(w1.name);
        System.out.println(w1.age);
        System.out.println(w1.working);
        System.out.println("-----------------");
        //行为
        w1.work();
    }
}
