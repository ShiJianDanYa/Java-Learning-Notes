package 面向对象基础.面向对象练习.厨师;

/**
 * ClassName: chef
 * Package: 面向对象基础.面向对象练习.厨师
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 17:21
 * @Version: v1.0
 *
 */
public class chef {
    /*
    面向对象思想表示厨师
    属性：姓名、年龄、厨艺等级
    行为：做菜
    */
    //姓名
    String name;
    //年龄
    int age;
    //厨艺等级
    int cookLevel;
    //行为 做菜
    public void cooking(){
        System.out.println("厨师在做菜");
    }
}
