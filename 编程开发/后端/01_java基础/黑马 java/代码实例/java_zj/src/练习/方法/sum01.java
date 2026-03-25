package 练习.方法;

/**
 * ClassName: sum01
 * Package: 练习.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/110:30
 * @Version1.0
 */

/*
定义一个方法，求两个整数的和。
 */
public class sum01 {
    public static void main(String[] args) {
        sum();
        System.out.println("程序结束");
    }
    public static void sum(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("两数之和为["+c+"]");
    }
}
