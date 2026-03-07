package 课堂代码.面向对象.类和对象01;

/**
 * ClassName: PhoneTest
 * Package: 课堂代码.面向对象.类和对象04
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/522:35
 * @Version1.0
 */
    
    /*
    需求如下
    1. 
    2.
    3. 
*/
public class PhoneTest {
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();
        //给手机赋值
        p1.brand = "华为";
        //获取赋值
        System.out.println(p1.brand);
        //调用方法
        p1.call();
        System.out.println("程序结束");
    }
}
