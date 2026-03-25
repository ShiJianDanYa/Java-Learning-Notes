package 课堂代码.方法.方法的声明使用.无参;

/**
 * ClassName: method01
 * Package: 课堂代码.方法
 * Description:
 *
 * @Author 锏箪
 * @Create 2025/4/110:17
 * @Version1.0
 */

/*
简单方法的声明与调用
 */
public class method01 {
    public static void main(String[] args) {
        // 调用方法 不调用，不执行
        //方法名（）;
        extracted();
        System.out.println("程序结束");
    }

    private static void extracted() {
        method();
    }

    // 定义一个方法 public static void 方法名（）
    // {
    // 方法体
    // }
    public static void method(){
        // 方法体
        System.out.println("方法体");
    }
}
