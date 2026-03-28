package 面向对象基础.面向对象练习.工人;

/**
 * ClassName: worker
 * Package: 面向对象基础.面向对象练习.工人
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 19:45
 * @Version: v1.0
 *
 */
public class worker {
    /*
    面向对象思想表示工人
    属性：姓名、年龄、技能等级
    行为：工作
    */
    //姓名
    String name;
    //年龄
    int age;
    //工龄
    int working;
    //行为
    public void work(){
        System.out.println("工人工作");
    }
}
