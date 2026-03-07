package 课堂.运算符.赋值运算符;

/**
 * ClassName: assignment
 * Package: 课堂.运算符.java08
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/3/2722:03
 * @Version1.0
 */

public class assignment {
    public static void main(String[] args) {
        //赋值运算符
        short a = 1;
        //等同于 a = a+1; 但是a是short类型
        //1 是 int 类型 a+1 为 int 类型 大转小
        //所以赋值运算符 底层会进行隐藏强制类型转换
        //正确结果为 a = (short)(a+1);
        a += 1;
        System.out.println(a);
    }
}
