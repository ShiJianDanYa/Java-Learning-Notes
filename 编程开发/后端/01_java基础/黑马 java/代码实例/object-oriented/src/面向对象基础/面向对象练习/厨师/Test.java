package 面向对象基础.面向对象练习.厨师;

/**
 * ClassName: Test
 * Package: 面向对象基础.面向对象练习.厨师
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/10 - 17:29
 * @Version: v1.0
 *
 */
public class Test {
    public static void main(String[] args){
        //厨师对象创建
        chef cook = new chef();
        //属性赋值
        cook.name = "王五";
        cook.age = 24;
        cook.cookLevel = 3;
        //输出厨师信息
        System.out.println("姓名"+cook.name+"年龄"+cook.age+"厨艺等级"+cook.cookLevel
        );
        //调用行为
        cook.cooking();
    }
}
