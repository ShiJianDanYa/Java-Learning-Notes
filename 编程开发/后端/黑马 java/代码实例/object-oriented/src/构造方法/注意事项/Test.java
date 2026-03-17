package 构造方法.注意事项;

/**
 * ClassName: Test
 * Package: 构造方法.注意事项
 * Description:
 *
 * @Author:锏澹
 * @Create: 2026/3/11 - 21:52
 * @Version: v1.0
 *
 */
public class Test {
    /*
    构造方法的注意事项：
        1.如果没有定义构造方法，系统将给出一个默认的无参数构造方法
        2.如果自己写了任意构造方法，系统将不再提供默认的构造方法
        3.带参构造方法和无参数构造方法，两者方法名相同，但是参数不同，这叫做构造方法的重
        4.习惯：无论是否使用，都手动书写无参数构造方法，和带全部参数的构造方法
        */
    public static void main(String[] args){
       //创建对象
         matters m1 = new matters();
         System.out.println("姓名："+m1.getName()+"年龄："+m1.getAge());
         matters m2 = new matters("张三",18);
         System.out.println("姓名："+m2.getName()+"年龄："+m2.getAge());

    }
}
